package individual.cy.learn.pattern.structural.decorator;

/**
 * @author mystic
 */
public class DecoratorPatternTester {
    public static void main(String[] args) {
        Shape circle = new Circle();
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
//        Shape violetCircle = new VioletShapeDecorator(new Circle());
//        Shape violetRectangle = new VioletShapeDecorator(new Rectangle());
        Shape redCircle = new RedShapeDecorator(Circle::new);
        Shape redRectangle = new RedShapeDecorator(Rectangle::new);
        Shape violetCircle = new VioletShapeDecorator(Circle::new);
        Shape violetRectangle = new VioletShapeDecorator(Rectangle::new);
        circle.draw();
        redCircle.draw();
        redRectangle.draw();
        violetCircle.draw();
        violetRectangle.draw();
    }
}
