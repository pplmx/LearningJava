package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public interface PackageState {
    /**
     * update package state
     *
     * @param ctx context
     */
    void updateState(DeliveryContext ctx);
}
