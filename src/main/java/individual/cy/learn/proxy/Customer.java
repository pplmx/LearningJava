package individual.cy.learn.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2/27/2018 17:27
 * @since JDK1.8.0_144
 */
public class Customer {
    public static void main(String[] args) {
        IProgrammer programmer = new JavaProgrammer("cc");
        IProgrammer proxy = new ProgrammerProxy(programmer);
        proxy.implementsDemand("Add User Management");
    }
}
