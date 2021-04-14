package individual.cy.learn.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mystic
 */
public class Subject {
    private final List<AbstractObserver> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        observerList.forEach(AbstractObserver::update);
    }

    public void attach(AbstractObserver observer) {
        observerList.add(observer);
    }
}
