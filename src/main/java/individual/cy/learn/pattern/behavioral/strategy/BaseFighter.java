package individual.cy.learn.pattern.behavioral.strategy;

/**
 * @author mystic
 */
public abstract class BaseFighter {
    protected KickBehavior kickBehavior;
    protected JumpBehavior jumpBehavior;

    public BaseFighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.kickBehavior = kickBehavior;
        this.jumpBehavior = jumpBehavior;
    }

    /**
     * display
     */
    public abstract void display();

    public void punch() {
        System.out.println("BaseFighter.punch");
    }

    public void roll() {
        System.out.println("BaseFighter.roll");
    }

    public void kick() {
        // delegate to KickBehavior
        kickBehavior.kick();
    }

    public void jump() {
        // delegate to JumpBehavior
        jumpBehavior.jump();
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }
}

