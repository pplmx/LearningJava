package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public class StrategyPatternTester {
    public static void main(String[] args) {
        // make some behaviors first
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior longJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // Make a fighter with desired behaviors
        BaseFighter ken = new KenFighter(tornadoKick, shortJump);
        ken.display();

        // Test behaviors
        ken.punch();
        ken.roll();
        ken.jump();
        ken.kick();

        // change behavior dynamically
        ken.setJumpBehavior(longJump);
        ken.jump();
    }
}
