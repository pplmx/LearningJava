package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public class OutForDelivery implements PackageState {

    private static volatile OutForDelivery singleton = null;

    private OutForDelivery() {
    }

    public static OutForDelivery instance() {
        if (singleton == null) {
            synchronized (OutForDelivery.class) {
                if (singleton == null) {
                    singleton = new OutForDelivery();
                }
            }
        }
        return singleton;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
    }
}
