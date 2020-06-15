package individual.cy.learn.pattern.behavioral.command;

/**
 * @author mystic
 */
public class Stereo {
    public void on() {
        System.out.println("Stereo.on");
    }

    public void off() {
        System.out.println("Stereo.off");
    }

    public void setCD() {
        System.out.println("Stereo.setCD");
    }

    public void setDVD() {
        System.out.println("Stereo.setDVD");
    }

    public void setRadio() {
        System.out.println("Stereo.setRadio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo.setVolume: volume = " + volume);
    }
}
