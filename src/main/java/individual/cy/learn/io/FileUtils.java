package individual.cy.learn.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2017/12/6 8:37
 * @since JDK9.0.1
 */
public class FileUtils {

    private static boolean isOkay = true;

    private FileUtils() {
    }

    private static boolean copyFile(File source, File target) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target))) {
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static boolean copyDirectory(File source, File target) {
        if (!target.exists()) {
            //noinspection ResultOfMethodCallIgnored
            target.mkdirs();
        }
        if (source.isDirectory()) {
            File newFolder = new File(target, source.getName());
            isOkay = newFolder.mkdirs();
            File[] fileArray = source.listFiles();
            for (File file : Objects.requireNonNull(fileArray)) {
                isOkay = copyDirectory(file, newFolder);
            }
        } else {
            File newFile = new File(target, source.getName());
            isOkay = copyFile(source, newFile);
        }
        return isOkay;
    }

    public static void main(String[] args) {
        File src = new File("d:/test");
        File dist = new File("d:/test2/ss.txt");
        copyDirectory(src, dist);
    }

}
