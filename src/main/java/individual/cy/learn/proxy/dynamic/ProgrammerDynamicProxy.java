package individual.cy.learn.proxy.dynamic;

import individual.cy.learn.proxy.IProgrammer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2/27/2018 17:40
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class ProgrammerDynamicProxy implements InvocationHandler {
    private IProgrammer programmer;

    public ProgrammerDynamicProxy(IProgrammer programmer) {
        this.programmer = programmer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(programmer, args);
    }
}
