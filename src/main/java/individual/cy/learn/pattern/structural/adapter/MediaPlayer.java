package individual.cy.learn.pattern.structural.adapter;

/**
 * @author mystic
 */
public interface MediaPlayer {
    /**
     * play a media resource
     *
     * @param audioType audio type
     * @param filename  file name
     */
    void play(String audioType, String filename);
}
