package individual.cy.learn.pattern.creational.abstractfactory;

/**
 * @author mystic
 */
public class ThreeDimensionShapeFactory extends AbstractFactory {

    @Override
    public GeometricShape getGeometricShape2D(ShapeType2D type) {
        return null;
    }

    @Override
    public GeometricShape getGeometricShape3D(ShapeType3D type) {
        switch (type) {
            case SPHERE:
                return new Sphere();
            case CUBE:
                return new Cube();
            case CYLINDER:
                return new Cylinder();
            default:
                return null;
        }
    }
}
