package individual.cy.learn.pattern.creational.abstractfactory;

/**
 * @author mystic
 */
public class TwoDimensionShapeFactory extends AbstractFactory {
    @Override
    public GeometricShape getGeometricShape2D(ShapeType2D type) {
        switch (type) {
            case LINE:
                return new Line();
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }

    @Override
    public GeometricShape getGeometricShape3D(ShapeType3D type) {
        return null;
    }
}
