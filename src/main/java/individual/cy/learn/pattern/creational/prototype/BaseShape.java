package individual.cy.learn.pattern.creational.prototype;

/**
 * @author mystic
 */
public abstract class BaseShape implements Cloneable {
    protected String type;
    private String id;

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
