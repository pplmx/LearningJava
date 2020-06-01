package individual.cy.learn.pattern.behavioral.observer;

/**
 * @author mystic
 */
public class BinaryObserver extends AbstractObserver {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("BinaryObserver.update: " + Integer.toBinaryString(subject.getState()));
    }
}
