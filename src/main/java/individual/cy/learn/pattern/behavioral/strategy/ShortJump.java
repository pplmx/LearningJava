package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("ShortJump.jump");
    }
}
