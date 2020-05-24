package individual.cy.learn.pattern.structural.decorator;

/**
 * @author mystic
 */
public class VioletShapeDecorator extends AbstractShapeDecorator {
    public VioletShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setVioletBorder(decoratedShape);
    }

    public void setVioletBorder(Shape decoratedShape) {
        System.out.println("VioletShapeDecorator.setVioletBorder");
    }
}
