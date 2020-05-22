package individual.cy.learn.pattern.creational.abstractfactory;

/**
 * @author mystic
 */
public abstract class AbstractFactory {
    /**
     * To get a 2d geometric shape
     *
     * @param type shape name
     * @return Geometric Shape
     */
    public abstract GeometricShape getGeometricShape2D(ShapeType2D type);

    /**
     * To get a 3d geometric shape
     *
     * @param type shape name
     * @return Geometric Shape
     */
    public abstract GeometricShape getGeometricShape3D(ShapeType3D type);
}
