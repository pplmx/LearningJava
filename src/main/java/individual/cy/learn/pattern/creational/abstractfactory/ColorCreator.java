package individual.cy.learn.pattern.creational.abstractfactory;

import java.util.function.Supplier;

/**
 * @author mystic
 */
public enum ColorCreator {
    /**
     * create Circle, Rectangle, Square
     */
    RED(Red::new), GREEN(Green::new), PURPLE(Purple::new);

    private final Supplier<Color> colorSupplier;

    ColorCreator(Supplier<Color> colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Color getInstance() {
        return colorSupplier.get();
    }

    public static Color getColor(ColorCreator color) {
        return color.getInstance();
    }
}
