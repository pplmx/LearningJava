package individual.cy.learn.pattern.behavioral.chain4responsibility;

public class Tester {
    public static void main(String[] args) {
        AbstractLogger debugLogger = new DebugLogger();
        debugLogger.logMessage(5, "Here is a debug message.");
        debugLogger.logMessage(4, "Here is a info message.");
        debugLogger.logMessage(3, "Here is a warn message.");
        debugLogger.logMessage(2, "Here is a error message.");
        debugLogger.logMessage(1, "Here is a fatal message.");
//        System.out.println();
//        debugLogger.logMsg(LogLevel.DEBUG, "Here is a debug message.");
//        debugLogger.logMsg(LogLevel.INFO, "Here is a info message.");
//        debugLogger.logMsg(LogLevel.WARN, "Here is a warn message.");
//        debugLogger.logMsg(LogLevel.ERROR, "Here is a error message.");
//        debugLogger.logMsg(LogLevel.FATAL, "Here is a fatal message.");
    }
}
