package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        this.level = AbstractLogger.ERROR;
        setNextLogger(null);
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger.write: " + message);
    }
}
