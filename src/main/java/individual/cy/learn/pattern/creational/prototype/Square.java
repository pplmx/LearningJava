package individual.cy.learn.pattern.creational.prototype;

/**
 * @author mystic
 */
public class Square extends BaseShape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }
}
