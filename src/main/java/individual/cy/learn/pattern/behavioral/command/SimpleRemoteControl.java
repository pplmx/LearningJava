package individual.cy.learn.pattern.behavioral.command;

/**
 * @author mystic
 */
public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
