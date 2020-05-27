package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class LightningKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("LightningKick.kick");
    }
}
