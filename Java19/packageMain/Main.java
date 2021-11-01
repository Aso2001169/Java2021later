package packageMain;

import packageIf.MyInterface;
import packageImpl.MyImple;

public class Main {
  public static void main(String[] args){
    MyImple myImple = new MyImple();
    /**
     * 間接的に呼び出し
     */
    myImple.test();
    /**
     * 直接呼び出し
     */
    MyInterface.s_method();
    myImple.def_method();
  }
}
