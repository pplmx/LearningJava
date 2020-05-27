package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class YeWenFighter extends BaseFighter {
    public YeWenFighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("YeWenFighter.display");
    }
}
