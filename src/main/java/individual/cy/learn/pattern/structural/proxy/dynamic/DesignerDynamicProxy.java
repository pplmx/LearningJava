package individual.cy.learn.pattern.structural.proxy.dynamic;

import individual.cy.learn.pattern.structural.proxy.IDesigner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @date 2/27/2018 17:40
 */
public class DesignerDynamicProxy implements InvocationHandler {
    private final IDesigner designer;

    public DesignerDynamicProxy(IDesigner designer) {
        this.designer = designer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(designer, args);
    }
}
