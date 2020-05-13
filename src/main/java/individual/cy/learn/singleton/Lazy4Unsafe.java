package individual.cy.learn.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description: 单例-懒汉式(单线程)
 * @date 2017/12/6 14:17
 * @since JDK9.0.1
 */
public class Lazy4Unsafe {
    private static Lazy4Unsafe singleton = null;

    private Lazy4Unsafe() {
    }

    public static Lazy4Unsafe getSingleton() {
        if (singleton == null) {
            singleton = new Lazy4Unsafe();
        }
        return singleton;
    }
}
