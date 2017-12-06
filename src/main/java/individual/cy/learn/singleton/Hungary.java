package individual.cy.learn.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/6 14:14
 * @since: JDK9.0.1
 * @version: X
 * Description: 单例-饿汉式
 */
public class Hungary {
    /**
     * 缺点未能解决延迟加载问题
     */
    private static Hungary singleton = new Hungary();

    private Hungary() {
    }

    public static Hungary getSingleton() {
        return singleton;
    }
}
