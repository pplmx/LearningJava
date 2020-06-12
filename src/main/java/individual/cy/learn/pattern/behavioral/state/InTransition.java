package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public class InTransition implements PackageState {

    private static volatile InTransition singleton = null;

    private InTransition() {
    }

    public static InTransition instance() {
        if (singleton == null) {
            synchronized (InTransition.class) {
                if (singleton == null) {
                    singleton = new InTransition();
                }
            }
        }
        return singleton;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is in transition !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}
