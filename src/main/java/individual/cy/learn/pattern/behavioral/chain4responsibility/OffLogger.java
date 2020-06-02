package individual.cy.learn.pattern.behavioral.chain4responsibility;

public class OffLogger extends AbstractLogger {
    public OffLogger() {
        this.level = AbstractLogger.OFF;
    }

    @Override
    protected void write(String message) {
        System.out.println("OffLogger.write: " + message);
    }
}
