package individual.cy.learn.pattern.behavioral.chain4responsibility;

public class FatalLogger extends AbstractLogger {
    public FatalLogger() {
        this.level = AbstractLogger.FATAL;
        setNextLogger(null);
    }

    @Override
    protected void write(String message) {
        System.out.println("FatalLogger.write: " + message);
    }
}
