package individual.cy.learn.pattern.creational.abstractfactory;

import java.util.function.Supplier;

/**
 * @author mystic
 */
public enum FactoryCreator {
    /**
     * create 2D, 3D geometric shape
     */
    TWO_D_SHAPE_FACTORY(TwoDimensionShapeFactory::new), THREE_D_SHAPE_FACTORY(ThreeDimensionShapeFactory::new);

    private final Supplier<AbstractFactory> factorySupplier;

    FactoryCreator(Supplier<AbstractFactory> factorySupplier) {
        this.factorySupplier = factorySupplier;
    }

    public static AbstractFactory getFactory(FactoryCreator creator) {
        return creator.getInstance();
    }

    public AbstractFactory getInstance() {
        return factorySupplier.get();
    }
}
