package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public class DeliveryContext {
    private PackageState currentState;
    private String packageId;

    public DeliveryContext(PackageState currentState, String packageId) {
        this.currentState = currentState != null ? currentState : Acknowledged.instance();
        this.packageId = packageId;
    }

    public void update() {
        currentState.updateState(this);
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }
}
