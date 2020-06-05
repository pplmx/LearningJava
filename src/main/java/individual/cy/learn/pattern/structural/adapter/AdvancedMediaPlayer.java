package individual.cy.learn.pattern.structural.adapter;

/**
 * @author mystic
 */
public interface AdvancedMediaPlayer {
    /**
     * play a vlc resource
     *
     * @param filename file name
     */
    void playVlc(String filename);

    /**
     * play a mp4 resource
     *
     * @param filename file name
     */
    void playMp4(String filename);
}
