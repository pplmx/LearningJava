package individual.cy.learn.pattern.behavioral.observer.sln2;

/**
 * @author mystic
 */
public class Tester {
    public static void main(String[] args) {
        Feed globalEvent = new Feed();

        Observer newYorkTimes = new NewYorkTimes();
        Observer peopleDaily = new PeopleDaily();

        globalEvent.registerObserver(newYorkTimes);
        globalEvent.registerObserver(peopleDaily);

        globalEvent.notifyObservers("Violent Parade in USA");

        System.out.println("Unregister New York Times!");
        globalEvent.unregisterObserver(newYorkTimes);
        globalEvent.notifyObservers("Violent Parade in Canada");
    }
}
