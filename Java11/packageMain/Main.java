package packageMain;
import javax.xml.namespace.QName;

import packageMario.FireMario;
import packageMario.Mario;
import packageMario.SkyMario;

public class Main {
  public static void main(String args[]){
    Mario mario=new Mario();
    mario.run();
    mario.jump();
    //FireMarioクラスのインスタンス変数を生成
    FireMario fireMario=new FireMario();
    fireMario.fireBall();
    //fireMarioに継承されたメソッド
    fireMario.run();
    fireMario.jump(); //オーバーライドしてる
    SkyMario skyMario=new SkyMario();
    skyMario.fly();
    //fireMarioに継承されたメソッド
    skyMario.run();//オーバーライドしてる
    skyMario.jump();

  }
}
