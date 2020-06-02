package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public enum LogLevel {
    /**
     * Log Level
     */
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4);

    private final int logLevel;

    LogLevel(int i) {
        this.logLevel = i;
    }

    public int getLogLevel() {
        return logLevel;
    }
}
