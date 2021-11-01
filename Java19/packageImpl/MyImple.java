package packageImpl;

import packageIf.MyInterface;

public class MyImple implements MyInterface {
  /**
   * my_num 定数
   */
  private int my_num=NUM;
  /**
   * s_method呼び出し
   */
  public void test(){
    MyInterface.s_method();
  }
    /**
   * デフォルトメソッドをオーバーライド
   */
  public void def_method(){
    System.out.println("def:オーバーライド済み");
  }
  /**
   * void omit()と書くと
   * !抽象メソッド扱いになる
   */
    @Override
    public void omit() {
      // TODO Auto-generated method stub
      
    }

}
