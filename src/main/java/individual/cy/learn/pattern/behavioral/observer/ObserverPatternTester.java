package individual.cy.learn.pattern.behavioral.observer;

/**
 * @author mystic
 */
public class ObserverPatternTester {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("========================");
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
