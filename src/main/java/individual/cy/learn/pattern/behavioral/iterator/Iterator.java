package individual.cy.learn.pattern.behavioral.iterator;

/**
 * @author mystic
 */
public interface Iterator {
    /**
     * has next()
     * @return true or false
     */
    boolean hasNext();

    /**
     * next obj
     * @return next Object
     */
    Object next();
}
