package individual.cy.learn.pattern.creational.abstractfactory;

import individual.cy.learn.pattern.creational.factory.Shape;
import individual.cy.learn.pattern.creational.factory.ShapeCreator;

import java.util.function.Supplier;

/**
 * @author mystic
 */
public enum AbstractFactory {
    COLOR(ColorCreator::new),SHAPE(ShapeCreator::new);

    private final Supplier<ColorCreator> colorCreatorSupplier;
    private final Supplier<ShapeCreator> shapeCreatorSupplier;

    AbstractFactory(Supplier<ColorCreator> colorCreatorSupplier) {
        this.colorCreatorSupplier = colorCreatorSupplier;
    }

    AbstractFactory(Supplier<ShapeCreator> shapeCreatorSupplier) {
        this.shapeCreatorSupplier = shapeCreatorSupplier;
    }
}
