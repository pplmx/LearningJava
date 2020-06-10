package individual.cy.learn.pattern.creational.prototype;

/**
 * @author mystic
 */
public abstract class BaseShape implements Cloneable {
    private String id;
    protected String type;

    /**
     * to draw a geometric
     */
    public abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public BaseShape clone() {
        BaseShape clone = null;
        try {
            clone = (BaseShape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
