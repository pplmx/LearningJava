package individual.cy.learn.pattern.creational.prototype;

/**
 * @author mystic
 */
public class PrototypePatternTester {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        BaseShape cachedShape1 = ShapeCache.getShape("1");
        System.out.println("cachedShape1.getType() = " + cachedShape1.getType());

        BaseShape cachedShape2 = ShapeCache.getShape("2");
        System.out.println("cachedShape2.getType() = " + cachedShape2.getType());

        BaseShape cachedShape3 = ShapeCache.getShape("3");
        System.out.println("cachedShape3.getType() = " + cachedShape3.getType());
    }
}
