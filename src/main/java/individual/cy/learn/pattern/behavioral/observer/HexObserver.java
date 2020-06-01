package individual.cy.learn.pattern.behavioral.observer;

/**
 * @author mystic
 */
public class HexObserver extends AbstractObserver {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HexObserver.update: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
