package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class KenFighter extends BaseFighter {
    public KenFighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("KenFighter.display");
    }
}
