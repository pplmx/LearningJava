package individual.cy.learn.pattern.structural.adapter;

/**
 * @author mystic
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("VlcPlayer.playVlc");
    }

    @Override
    public void playMp4(String filename) {

    }
}
