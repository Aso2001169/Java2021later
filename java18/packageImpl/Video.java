package packageImpl;
import packageIf.*;
public class Video extends Device implements IController,IMaintenance{

  @Override
 /**
  * タイトルを表示する
  * @param play 再生
  */
  public void play() {
    // TODO Auto-generated method stub
    System.out.println("Video再生");
  }

  @Override

  public void stop() {
    // TODO Auto-generated method stub
    System.out.println("Video停止");
  }

  @Override
  public void healthcheck() {
    // TODO Auto-generated method stub
    if(this.batteryVal<=BATTERY_LOW){
          System.out.println("電源がなくなりました");
        }
  }
  // @Override
  // public void healthCheck(){
  //   if(this.batteryVal<=BATTERY_LOW){
  //     System.out.println("電源がなくなりました");
  //   }
  // }
}
