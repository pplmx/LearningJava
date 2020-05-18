package individual.cy.learn.pattern.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * <p>
 * Description: 单例-饿汉式
 * @date 2017/12/6 14:14
 */
public class Hungary {
    /**
     * 缺点未能解决延迟加载问题
     */
    private static final Hungary singleton = new Hungary();

    private Hungary() {
    }

    public static Hungary getSingleton() {
        return singleton;
    }
}
