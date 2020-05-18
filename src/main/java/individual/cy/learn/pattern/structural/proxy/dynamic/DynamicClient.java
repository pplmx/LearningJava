package individual.cy.learn.pattern.structural.proxy.dynamic;

import individual.cy.learn.pattern.structural.proxy.IDesigner;
import individual.cy.learn.pattern.structural.proxy.JavaDesigner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @date 2/27/2018 17:44
 */
public class DynamicClient {

    public static void main(String[] args) {
        // 被代理的真实对象
        IDesigner designer = new JavaDesigner("cc");
        // 创建中介类实例
        InvocationHandler handler = new DesignerDynamicProxy(designer);
        Class clazz = designer.getClass();
        // 获取类加载器
        ClassLoader classLoader = clazz.getClassLoader();
        // 动态产生一个代理类
        IDesigner proxy = (IDesigner) Proxy.newProxyInstance(classLoader, clazz.getInterfaces(), handler);
        // 通过代理类,执行doSomething()方法
        proxy.implementsDemand("Modify User Management");
    }

}
