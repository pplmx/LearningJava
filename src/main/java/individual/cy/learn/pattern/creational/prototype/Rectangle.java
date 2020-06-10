package individual.cy.learn.pattern.creational.prototype;

/**
 * @author mystic
 */
public class Rectangle extends BaseShape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }
}
