package individual.cy.learn.pattern.behavioral.chain4responsibility;

/**
 * @author mystic
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger() {
        this.level = AbstractLogger.INFO;
        setNextLogger(new WarnLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLogger.write: " + message);
    }
}
