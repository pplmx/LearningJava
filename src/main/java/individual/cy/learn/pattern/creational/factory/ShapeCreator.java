package individual.cy.learn.pattern.creational.factory;

import java.util.function.Supplier;

/**
 * @author mystic
 */
public enum ShapeCreator {
    /**
     * create Circle, Rectangle, Square
     */
    CIRCLE(Circle::new), RECTANGLE(Rectangle::new), SQUARE(Square::new);

    private final Supplier<Shape> shapeSupplier;

    ShapeCreator(Supplier<Shape> shapeSupplier) {
        this.shapeSupplier = shapeSupplier;
    }

    public Shape getInstance() {
        return shapeSupplier.get();
    }

    public static Shape getShape(ShapeCreator creator) {
        return creator.getInstance();
    }
}

enum ShapeCreator2 {
    /**
     * create Circle, Rectangle, Square
     */
    CIRCLE(new Circle()), RECTANGLE(new Rectangle()), SQUARE(new Square());

    private final Shape shape;

    ShapeCreator2(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}