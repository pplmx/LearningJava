package individual.cy.learn.pattern.behavioral.observer.sln2;

/**
 * @author mystic
 */
public class PeopleDaily implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Breaking news in People Daily! event = " + event);
    }
}
