package AdapterPattern;

public class VideoPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing video.. "+fileName);
        
    }
    
}
