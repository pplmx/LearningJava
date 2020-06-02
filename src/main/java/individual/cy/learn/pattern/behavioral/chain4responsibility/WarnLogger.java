package individual.cy.learn.pattern.behavioral.chain4responsibility;

public class WarnLogger extends AbstractLogger {
    public WarnLogger() {
        this.level = AbstractLogger.WARN;
        setNextLogger(new ErrorLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("WarnLogger.write: " + message);
    }
}
