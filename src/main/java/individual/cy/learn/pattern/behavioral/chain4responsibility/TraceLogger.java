package individual.cy.learn.pattern.behavioral.chain4responsibility;

public class TraceLogger extends AbstractLogger {
    public TraceLogger() {
        this.level = AbstractLogger.TRACE;
        setNextLogger(new DebugLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("TraceLogger.write: " + message);
    }
}
