package individual.cy.learn.pattern.creational.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * <p>
 * Description: 单例-静态内部类实现
 * @date 2017/12/6 15:31
 */
public class SingletonByStaticInnerClass {
    private SingletonByStaticInnerClass() {
    }

    public static SingletonByStaticInnerClass getSingleton() {
        return Holder.singleton;
    }

    private static class Holder {
        private static final SingletonByStaticInnerClass singleton = new SingletonByStaticInnerClass();
    }
}
