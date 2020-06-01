package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public abstract class AbstractLogger {
    public final static int ALL = 7;
    public final static int TRACE = 6;
    public final static int DEBUG = 5;
    public final static int INFO = 4;
    public final static int WARN = 3;
    public final static int ERROR = 2;
    public final static int FATAL = 1;
    public final static int OFF = 0;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level < level) {
            write(message);
        }
    }

    /**
     * write log
     *
     * @param message log info
     */
    protected abstract void write(String message);

}
