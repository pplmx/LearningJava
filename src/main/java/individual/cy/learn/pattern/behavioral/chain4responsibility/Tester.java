package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public class Tester {
    public static void main(String[] args) {
        AbstractLogger infoLogger = new InfoLogger();
        System.out.println("**************************");
        infoLogger.logMessage(2, "Here is a debug message.");
        System.out.println("==========================");
        infoLogger.logMessage(3, "Here is a info message.");
        System.out.println("==========================");
        infoLogger.logMessage(4, "Here is a warn message.");
        System.out.println("==========================");
        infoLogger.logMessage(5, "Here is a error message.");
        System.out.println("==========================");
        infoLogger.logMsg(LogLevel.DEBUG, "Here is a debug message.");
        infoLogger.logMsg(LogLevel.INFO, "Here is a info message.");
        infoLogger.logMsg(LogLevel.WARN, "Here is a warn message.");
        infoLogger.logMsg(LogLevel.ERROR, "Here is a error message.");
    }
}
