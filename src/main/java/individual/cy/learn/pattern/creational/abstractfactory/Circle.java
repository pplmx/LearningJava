package individual.cy.learn.pattern.creational.abstractfactory;

/**
 * @author mystic
 */
public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
}
