package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public class Shipped implements PackageState {

    private static volatile Shipped singleton = null;

    private Shipped() {
    }

    public static Shipped instance() {
        if (singleton == null) {
            synchronized (Shipped.class) {
                if (singleton == null) {
                    singleton = new Shipped();
                }
            }
        }
        return singleton;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is shipped !!");
        ctx.setCurrentState(InTransition.instance());
    }
}
