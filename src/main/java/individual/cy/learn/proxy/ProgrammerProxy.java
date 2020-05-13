package individual.cy.learn.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2/27/2018 17:25
 * @since JDK1.8.0_144
 */
public class ProgrammerProxy implements IProgrammer {
    private final IProgrammer programmer;

    public ProgrammerProxy(IProgrammer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void implementsDemand(String demandName) {
        programmer.implementsDemand(demandName);
    }
}
