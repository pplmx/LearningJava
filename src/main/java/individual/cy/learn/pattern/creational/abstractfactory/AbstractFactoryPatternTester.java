package individual.cy.learn.pattern.creational.abstractfactory;

/**
 * @author mystic
 */
public class AbstractFactoryPatternTester {
    public static void main(String[] args) {
        // draw 2d shape
        FactoryCreator.TWO_D_SHAPE_FACTORY
            .getInstance()
            .getGeometricShape2D(ShapeType2D.LINE)
            .draw();

        // draw 3d shape
        FactoryCreator.THREE_D_SHAPE_FACTORY
            .getInstance()
            .getGeometricShape3D(ShapeType3D.CYLINDER)
            .draw();
    }
}
