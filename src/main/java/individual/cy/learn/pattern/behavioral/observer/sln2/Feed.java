package individual.cy.learn.pattern.behavioral.observer.sln2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mystic
 */
public class Feed implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        observers.forEach(o -> o.update(event));
    }
}
