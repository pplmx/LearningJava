package individual.cy.learn.proxy.dynamic;

import individual.cy.learn.proxy.IProgrammer;
import individual.cy.learn.proxy.JavaProgrammer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2/27/2018 17:44
 * @since JDK1.8.0_144
 */
public class DynamicClient {

    public static void main(String[] args) {
        // 被代理的真实对象
        IProgrammer programmer = new JavaProgrammer("cc");
        // 创建中介类实例
        InvocationHandler handler = new ProgrammerDynamicProxy(programmer);
        Class clazz = programmer.getClass();
        // 获取类加载器
        ClassLoader classLoader = clazz.getClassLoader();
        // 动态产生一个代理类
        IProgrammer proxy = (IProgrammer) Proxy.newProxyInstance(classLoader, clazz.getInterfaces(), handler);
        // 通过代理类,执行doSomething()方法
        proxy.implementsDemand("Modify User Management");
    }

}
