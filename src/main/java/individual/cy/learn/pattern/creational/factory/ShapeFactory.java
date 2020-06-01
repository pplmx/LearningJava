package individual.cy.learn.pattern.creational.factory;

/**
 * @author mystic
 */
public class ShapeFactory {
    public Shape getShape(ShapeEnum shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }

    enum ShapeEnum {
        /**
         * Geometric Shape type
         */
        CIRCLE, RECTANGLE, SQUARE
    }
}
