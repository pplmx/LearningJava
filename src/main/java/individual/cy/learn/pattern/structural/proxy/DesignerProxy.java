package individual.cy.learn.pattern.structural.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @date 2/27/2018 17:25
 */
public class DesignerProxy implements IDesigner {
    private final IDesigner programmer;

    public DesignerProxy(IDesigner programmer) {
        this.programmer = programmer;
    }

    @Override
    public void implementsDemand(String demandName) {
        programmer.implementsDemand(demandName);
    }
}
