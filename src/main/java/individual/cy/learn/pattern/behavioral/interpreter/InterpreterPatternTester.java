package individual.cy.learn.pattern.behavioral.interpreter;

/**
 * @author mystic
 */
public class InterpreterPatternTester {
    public static void main(String[] args) {
        // rule: Kushagra and Lokesh are both male.
        Expression person1 = new TerminalExpression("Kushagra");
        Expression person2 = new TerminalExpression("Lokesh");
        Expression isSingle = new OrExpression(person1, person2);

        // rule: Vikram is committed.
        Expression vikram = new TerminalExpression("Vikram");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpret("Kushagra"));
        System.out.println(isSingle.interpret("Lokesh"));
        System.out.println(isSingle.interpret("Achint"));

        System.out.println(isCommitted.interpret("Committed, Vikram"));
        System.out.println(isCommitted.interpret("Single, Vikram"));
    }
}
