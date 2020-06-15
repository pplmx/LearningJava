package individual.cy.learn.pattern.behavioral.command;

/**
 * @author mystic
 */
public class CommandPatternTester {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        // change command dynamically
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();

        remote.setCommand(new StereoOnWithCdCommand(stereo));
        remote.buttonWasPressed();

        remote.setCommand(new StereoOffCommand(stereo));
        remote.buttonWasPressed();
    }
}
