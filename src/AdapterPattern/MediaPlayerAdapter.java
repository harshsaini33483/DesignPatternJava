package AdapterPattern;

public class MediaPlayerAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;
    public MediaPlayerAdapter(){
        advanceMediaPlayer = new VideoPlayer();
    }
    @Override
    public void play(String fileName, String type) {
        advanceMediaPlayer.playVideo(fileName);
    }

}
