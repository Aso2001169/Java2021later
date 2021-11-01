package packageIf;

public interface MyInterface {
  final int NUM=123;
  /**
   * staticは値が変わらないメソッド
   */
  public static void s_method(){
    System.out.println("s_method"+NUM);
  }
  // public void mon_s_method(){

  // }
  /**
   * オーバーライド放棄
   */
  default void def_method(){
    System.out.println("オーバーライド放棄");
  }
  /**
   * privateメソッド
   */
  private void p_method(){
    System.out.println("p_s_method");
  }
  /**
   * private staticメソッド
   */
  private static void p_s_method(){
    System.out.println("p_s_method");
  }
  default void def_p_method(){
    this.def_p_method();
    MyInterface.p_s_method();
  }
  void omit();
}
