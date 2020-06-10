package individual.cy.learn.pattern.structural.bridge;

/**
 * @author mystic
 */
public abstract class BaseShape {
    protected DrawApi drawApi;

    protected BaseShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * To draw a geometric shape
     */
    public abstract void draw();
}
