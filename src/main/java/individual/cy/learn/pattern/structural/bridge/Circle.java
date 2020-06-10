package individual.cy.learn.pattern.structural.bridge;

/**
 * @author mystic
 */
public class Circle extends BaseShape {
    private final int x;
    private final int y;
    private final int radius;

    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
