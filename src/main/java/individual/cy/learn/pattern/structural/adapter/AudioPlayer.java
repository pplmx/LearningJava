package individual.cy.learn.pattern.structural.adapter;

/**
 * @author mystic
 */
public class AudioPlayer implements MediaPlayer {

    public MediaPlayer mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        audioType = audioType.toLowerCase();
        switch (audioType) {
            case "mp3":
                System.out.println("AudioPlayer.play: MP3 is playing.");
                break;
            case "vlc":
            case "mp4":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, filename);
                break;
            default:
                System.out.println("AudioPlayer.play: Invalid Media [ " + audioType + " ], the format is not supported.");
                break;
        }
    }
}
