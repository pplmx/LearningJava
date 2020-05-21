package individual.cy.learn.pattern.creational.factory;

/**
 * @author mystic
 */
public class FactoryPatternTester {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Acquire Circle
        Shape circle = factory.getShape("circle");
        circle.draw();

        // Acquire Rectangle
        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();

        // Acquire Square
        Shape square = factory.getShape("square");
        square.draw();

        System.out.println();

        ShapeCreator.CIRCLE.getShape().draw();
        ShapeCreator.RECTANGLE.getShape().draw();
        ShapeCreator.SQUARE.getShape().draw();

        System.out.println();

        System.out.println(ShapeCreator.CIRCLE.getShape());
        System.out.println(ShapeCreator.CIRCLE.getShape());
        System.out.println(ShapeCreator.CIRCLE.getShape());

        System.out.println();

        System.out.println(ShapeCreator2.CIRCLE.getShape());
        System.out.println(ShapeCreator2.CIRCLE.getShape());
        System.out.println(ShapeCreator2.CIRCLE.getShape());

    }
}
