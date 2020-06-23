package individual.cy.learn.mess;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mystic
 */
public class DeepCopyUtils {
    public static <T extends Serializable> T clone(T obj) {
        T cloneObj = null;
        try {
            // write byte stream
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                    oos.writeObject(obj);
                }
                // assign memory, write raw object, generate new object
                try (ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray())) {
                    try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                        // return new object
                        // noinspection unchecked
                        cloneObj = (T) ois.readObject();
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Some errors occurred during cloning." + e);
        }
        return cloneObj;
    }

    public static <T extends Serializable> T cloneWithLimited(T obj) {
        T cloneObj = null;
        try {
            // write byte stream
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                    oos.writeObject(obj);
                }
                // assign memory, write raw object, generate new object
                try (ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray())) {
                    // FIXME maybe read file is much better
                    Set<Object> whitelist = new HashSet<>(Arrays.asList("GoodClass1", "GoodClass2"));
                    try (WhitelistedObjectInputStream ois = new WhitelistedObjectInputStream(bais, whitelist)) {
                        // return new object
                        // noinspection unchecked
                        cloneObj = (T) ois.readObject();
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Some errors occurred during cloning." + e);
        }
        return cloneObj;
    }
}

class WhitelistedObjectInputStream extends ObjectInputStream {
    private final Set<Object> whitelist;

    WhitelistedObjectInputStream(InputStream inputStream, Set<Object> wl) throws IOException {
        super(inputStream);
        whitelist = Collections.unmodifiableSet(wl);
    }

    @Override
    protected Class<?> resolveClass(ObjectStreamClass cls) throws IOException, ClassNotFoundException {
        if (!whitelist.contains(cls.getName())) {
            throw new InvalidClassException("Unexpected serialized class", cls.getName());
        }
        return super.resolveClass(cls);
    }
}
