package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class TornadoKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("TornadoKick.kick");
    }
}
