package individual.cy.learn.pattern.structural.bridge;

/**
 * @author mystic
 */
public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("[Draw a red circle] radius = " + radius + ", x = " + x + ", y = " + y);
    }
}
