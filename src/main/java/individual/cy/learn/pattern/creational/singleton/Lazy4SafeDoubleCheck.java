package individual.cy.learn.pattern.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * <p>
 * Description: 单例-懒汉式(多线程)--双重校验锁
 * @date 2017/12/6 15:23
 */
public class Lazy4SafeDoubleCheck {
    private static volatile Lazy4SafeDoubleCheck singleton = null;

    private Lazy4SafeDoubleCheck() {
    }

    public static Lazy4SafeDoubleCheck getSingleton() {
        if (singleton == null) {
            synchronized (Lazy4SafeDoubleCheck.class) {
                if (singleton == null) {
                    singleton = new Lazy4SafeDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
