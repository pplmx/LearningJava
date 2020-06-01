package individual.cy.learn.pattern.behavioral.observer.sln2;

/**
 * @author mystic
 */
public interface Subject {
    /**
     * register
     *
     * @param observer observer
     */
    void registerObserver(Observer observer);

    /**
     * unregister
     *
     * @param observer observer
     */
    void unregisterObserver(Observer observer);

    /**
     * notify all observers
     * @param event event
     */
    void notifyObservers(String event);
}
