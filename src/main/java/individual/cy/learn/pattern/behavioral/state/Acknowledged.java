package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public class Acknowledged implements PackageState {

    private static volatile Acknowledged singleton = null;

    private Acknowledged() {
    }

    public static Acknowledged instance() {
        if (singleton == null) {
            synchronized (Acknowledged.class) {
                if (singleton == null) {
                    singleton = new Acknowledged();
                }
            }
        }
        return singleton;
    }


    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.instance());
    }
}
