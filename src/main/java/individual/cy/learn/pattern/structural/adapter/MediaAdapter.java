package individual.cy.learn.pattern.structural.adapter;

/**
 * @author mystic
 */
public class MediaAdapter implements MediaPlayer {

    public AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        audioType = audioType.toLowerCase();
        switch (audioType) {
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
                break;
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
                break;
        }
    }

    @Override
    public void play(String audioType, String filename) {
        audioType = audioType.toLowerCase();
        switch (audioType) {
            case "vlc":
                advancedMediaPlayer.playVlc(filename);
                break;
            case "mp4":
                advancedMediaPlayer.playMp4(filename);
                break;
            default:
                break;
        }
    }
}
