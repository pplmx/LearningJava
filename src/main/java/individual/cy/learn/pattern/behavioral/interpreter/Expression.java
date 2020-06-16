package individual.cy.learn.pattern.behavioral.interpreter;

/**
 * @author mystic
 */
public interface Expression {
    /**
     * interpret
     *
     * @param context context
     * @return true or false
     */
    boolean interpret(String context);
}
