package individual.cy.learn.singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/6 15:31
 * @since: JDK9.0.1
 * @version: X
 * Description: 单例-静态内部类实现
 */
public class SingletonByStaticInnerClass {
    private static class Holder {
        private static SingletonByStaticInnerClass singleton = new SingletonByStaticInnerClass();
    }

    private SingletonByStaticInnerClass() {
    }

    public static SingletonByStaticInnerClass getSingleton() {
        return Holder.singleton;
    }
}
