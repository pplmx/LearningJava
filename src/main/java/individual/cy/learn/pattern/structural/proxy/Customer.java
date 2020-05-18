package individual.cy.learn.pattern.structural.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @date 2/27/2018 17:27
 */
public class Customer {
    public static void main(String[] args) {
        IDesigner designer = new JavaDesigner("cc");
        IDesigner proxy = new DesignerProxy(designer);
        proxy.implementsDemand("Add User Management");
    }
}
