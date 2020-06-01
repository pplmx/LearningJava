package individual.cy.learn.pattern.behavioral.observer;

/**
 * @author mystic
 */
public abstract class AbstractObserver {
    protected Subject subject;

    /**
     * update
     */
    public abstract void update();
}
