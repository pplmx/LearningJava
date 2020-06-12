package individual.cy.learn.pattern.behavioral.state;

/**
 * @author mystic
 */
public class StatePatternTester {
    public static void main(String[] args) {
        DeliveryContext ctx = new DeliveryContext(null, "Test1");
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
