package individual.cy.learn.pattern.behavioral.command;

/**
 * @author mystic
 */
public class StereoOnWithCdCommand implements Command {
    private final Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
