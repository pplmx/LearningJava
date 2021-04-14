package individual.cy.learn.pattern.structural.bridge;

/**
 * @author mystic
 */
public interface DrawApi {
    /**
     * To draw a circle
     *
     * @param radius radius
     * @param x      Abscissa, X-axis
     * @param y      ordinate, Y-axis
     */
    void drawCircle(int radius, int x, int y);
}
