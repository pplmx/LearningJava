package individual.cy.learn.pattern.behavioral.observer;

/**
 * @author mystic
 */
public class OctalObserver extends AbstractObserver {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("OctalObserver.update: " + Integer.toOctalString(subject.getState()));
    }
}
