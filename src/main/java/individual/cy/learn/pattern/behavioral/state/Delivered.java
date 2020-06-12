package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public class Delivered implements PackageState {

    private static volatile Delivered singleton = null;

    private Delivered() {
    }

    public static Delivered instance() {
        if (singleton == null) {
            synchronized (Delivered.class) {
                if (singleton == null) {
                    singleton = new Delivered();
                }
            }
        }
        return singleton;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is delivered !!");
    }
}
