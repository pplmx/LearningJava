package individual.cy.learn.pattern.creational.prototype;

import java.util.Hashtable;

/**
 * @author mystic
 */
public class ShapeCache {

    private static final Hashtable<String, BaseShape> SHAPE_MAP = new Hashtable<String, BaseShape>();

    public static BaseShape getShape(String shapeId) {
        BaseShape cachedShape = SHAPE_MAP.get(shapeId);
        return cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(), rectangle);
    }

}
