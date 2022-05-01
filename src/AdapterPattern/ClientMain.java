package AdapterPattern;

public class ClientMain {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("myAudio.mp3","mp3" );
        MediaPlayer videoPlayer = new AudioPlayer();
        videoPlayer.play("myLife.mp4","mp4");
    }
}
