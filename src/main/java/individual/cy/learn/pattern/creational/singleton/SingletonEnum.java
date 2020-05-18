package individual.cy.learn.pattern.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * <p>
 * Description: 单例-枚举方式实现
 * @date 2017/12/6 15:35
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
