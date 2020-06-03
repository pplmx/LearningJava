package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public class Tester {
    public static void main(String[] args) {
        AbstractLogger debugLogger = new DebugLogger();
        System.out.println("**************************");
        debugLogger.logMessage(1, "Here is a debug message.");
        System.out.println("==========================");
        debugLogger.logMessage(2, "Here is a info message.");
        System.out.println("==========================");
        debugLogger.logMessage(3, "Here is a warn message.");
        System.out.println("==========================");
        debugLogger.logMessage(4, "Here is a error message.");
        System.out.println("==========================");
    }
}
