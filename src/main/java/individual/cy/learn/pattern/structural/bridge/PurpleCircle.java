package individual.cy.learn.pattern.structural.bridge;

/**
 * @author mystic
 */
public class PurpleCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("[Draw a purple circle] radius = " + radius + ", x = " + x + ", y = " + y);
    }
}
