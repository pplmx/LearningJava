package individual.cy.learn.pattern.creational.prototype;

/**
 * @author mystic
 */
public class Circle extends BaseShape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
}
