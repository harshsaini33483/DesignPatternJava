package AdapterPattern;

public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String fileName, String type) {
        
        if(type.equals("mp3")){
            System.out.println("Playing audio... "+fileName);
        }else{
           MediaPlayer mediaAdapter = new MediaPlayerAdapter();
            mediaAdapter.play(fileName, type);
        }
        
    }
    
}
