package individual.cy.learn.pattern.behavioral.chain4responsibility;

public enum LogLevel {
    /**
     * Log Level
     */
    ALL(7),
    TRACE(6),
    DEBUG(5),
    INFO(4),
    WARN(3),
    ERROR(2),
    FATAL(1),
    OFF(0);

    private final int logLevel;

    LogLevel(int i) {
        this.logLevel = i;
    }

    public int getLogLevel() {
        return logLevel;
    }
}
