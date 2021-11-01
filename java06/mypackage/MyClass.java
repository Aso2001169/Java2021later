package java06.mypackage;

public class MyClass {
  public void printMessage(){
    //Objectクラスから継承したメソッドを使う
    //パッケージ名とクラス名を取得して表示
    System.out.println(MyClass.class.getName());
  }
}
