package packageMain;
// VideoクラスだけでOK
import packageImpl.Video;
import packageImpl.Music;
public class Main {
  public static void main(String[] args){
    Video video=new Video();
    video.play();
    video.stop();
    //上とは違うインターフェース
    video.healthcheck();
    Music music=new Music();
    music.play();
    music.stop();
    music.healthcheck();
  }
}
