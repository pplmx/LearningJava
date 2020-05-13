package individual.cy.learn.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description: 单例-懒汉式(多线程)
 * @date 2017/12/6 14:24
 * @since JDK9.0.1
 */
public class Lazy4Safe {
    private static Lazy4Safe singleton = null;

    private Lazy4Safe() {
    }

    public static synchronized Lazy4Safe getSingleton() {
        if (singleton == null) {
            singleton = new Lazy4Safe();
        }
        return singleton;
    }
}
