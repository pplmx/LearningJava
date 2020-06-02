package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger() {
        this.level = AbstractLogger.DEBUG;
        setNextLogger(new InfoLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLogger.write: " + message);
    }
}
