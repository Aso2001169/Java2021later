package packageMario;
public class Mario {
  //走るメソッド
  public void run(){
    System.out.printf("%s Running!\n",this.getClass().getName());
  }
  //飛ぶメソッド
  public void jump(){
    System.out.printf("%s Jumping\n",this.getClass().getName());
  }
}
