package individual.cy.learn.pattern.structural.decorator;

/**
 * @author mystic
 */
public class RedShapeDecorator extends AbstractShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("RedShapeDecorator.setRedBorder");
    }
}
