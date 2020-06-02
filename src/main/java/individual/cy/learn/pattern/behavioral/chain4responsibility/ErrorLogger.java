package individual.cy.learn.pattern.behavioral.chain4responsibility;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        this.level = AbstractLogger.ERROR;
        setNextLogger(new FatalLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger.write: " + message);
    }
}
