package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class ChunLiFighter extends BaseFighter {
    public ChunLiFighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("ChunLiFighter.display");
    }
}
