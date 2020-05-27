package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class LongJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("LongJump.jump");
    }
}
