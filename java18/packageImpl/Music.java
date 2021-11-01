package packageImpl;
import packageIf.*;
public class Music extends Device implements IController,IMaintenance{

  @Override
 /**
  * タイトルを表示する
  * @param play 再生
  */
  public void play() {
    // TODO Auto-generated method stub
    System.out.println("音楽再生");
  }

  @Override

  public void stop() {
    // TODO Auto-generated method stub
    System.out.println("音楽停止");
  }

  @Override
  public void healthcheck() {
    // TODO Auto-generated method stub
    if(this.batteryVal<=BATTERY_LOW1){
          System.out.println("電源が少なくなりました");
        }
  }
  // @Override
  // public void healthCheck(){
  //   if(this.batteryVal<=BATTERY_LOW){
  //     System.out.println("電源がなくなりました");
  //   }
  // }
}

