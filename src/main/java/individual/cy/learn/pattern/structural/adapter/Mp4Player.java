package individual.cy.learn.pattern.structural.adapter;

/**
 * @author mystic
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Mp4Player.playMp4");
    }
}
