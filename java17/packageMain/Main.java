package packageMain;

import packageComp.*;
public class Main {
  public static void main(String[] args){
    String input="A";
    String testData="B";
    // System.out.printf("%sの文字コード:%d\n",input,input.codePointAt(0));
    // System.out.printf("%sの文字コード:%d\n",testData,testData.codePointAt(0));
    /*
    ** Compクラスで比較
    */
    Comp comp = new Comp(input);
        /*
    ** CompToメソッドで比較
    */
    int ret= comp.compareTo(testData);
    String operator="不明";
    switch(ret){
      case 0:{operator="="; break;}
      case 1:{operator=">"; break;}
      case -1:{operator="<"; break;}
      default:{}
    }
    System.out.printf("メイン:%s %s 比較:%s",comp.getData(),operator,testData);
  }
}
