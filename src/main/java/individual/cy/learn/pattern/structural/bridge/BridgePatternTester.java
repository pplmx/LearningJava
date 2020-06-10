package individual.cy.learn.pattern.structural.bridge;

/**
 * @author mystic
 */
public class BridgePatternTester {
    public static void main(String[] args) {
        BaseShape redCircle = new Circle(new RedCircle(), 0, 0, 3);
        BaseShape purpleCircle = new Circle(new PurpleCircle(), 0, 6, 3);

        redCircle.draw();
        purpleCircle.draw();
    }
}
