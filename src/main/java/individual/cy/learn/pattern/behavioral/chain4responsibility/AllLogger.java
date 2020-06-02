package individual.cy.learn.pattern.behavioral.chain4responsibility;

public class AllLogger extends AbstractLogger {
    public AllLogger() {
        this.level = AbstractLogger.ALL;
        setNextLogger(new TraceLogger());
    }

    @Override
    protected void write(String message) {
        System.out.println("AllLogger.write: " + message);
    }
}
