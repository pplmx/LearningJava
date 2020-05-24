package individual.cy.learn.pattern.structural.decorator;

/**
 * @author mystic
 */
public abstract class AbstractShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public AbstractShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
