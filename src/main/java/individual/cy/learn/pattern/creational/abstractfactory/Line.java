package individual.cy.learn.pattern.creational.abstractfactory;

/**
 * @author mystic
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line.draw");
    }
}
