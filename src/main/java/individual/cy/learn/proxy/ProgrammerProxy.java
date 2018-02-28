package individual.cy.learn.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2/27/2018 17:25
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class ProgrammerProxy implements IProgrammer {
    private IProgrammer programmer;

    public ProgrammerProxy(IProgrammer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void implementsDemand(String demandName) {
        programmer.implementsDemand(demandName);
    }
}
