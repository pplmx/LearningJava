package individual.cy.learn.pattern.behavioral.observer.sln2;

/**
 * @author mystic
 */
public class NewYorkTimes implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Breaking news in New York Times! event = " + event);
    }
}
