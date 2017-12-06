package individual.cy.learn.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/6 15:35
 * @since: JDK9.0.1
 * @version: X
 * Description: 单例-枚举方式实现
 */
public enum SingletonEnum {
    /**
     * 使用枚举实现的单例
     */
    INSTANCE;

    public void otherMethods() {
        System.out.println("Something");
    }
}
