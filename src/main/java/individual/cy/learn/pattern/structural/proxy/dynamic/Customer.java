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
public class Customer {

    public static void main(String[] args) {
        // 被代理的真实对象
        IDesigner designer = new JavaDesigner("cc");
        // 创建中介类实例
        InvocationHandler handler = new DesignerDynamicProxy(designer);
        // 动态产生一个代理类
        IDesigner proxy = (IDesigner) Proxy.newProxyInstance(
                designer.getClass().getClassLoader(),
                designer.getClass().getInterfaces(),
                handler);
        // 通过代理类,执行doSomething()方法
        proxy.implementsDemand("Modify User Management");
    }

}
