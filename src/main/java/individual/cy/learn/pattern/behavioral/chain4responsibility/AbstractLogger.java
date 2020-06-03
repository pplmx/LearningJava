package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public abstract class AbstractLogger {
    public final static int DEBUG = 1;
    public final static int INFO = 2;
    public final static int WARN = 3;
    public final static int ERROR = 4;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        // if no ability to handle, hand up it to successor
        if (this.level == level) {
            write(message);
        } else {
            if (nextLogger != null) {
                nextLogger.logMessage(level, message);
            }
        }
    }

    /**
     * write log
     *
     * @param message log info
     */
    protected abstract void write(String message);

}
