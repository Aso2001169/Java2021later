import java.util.Scanner;

public class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=4;
    try{
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("cの値は"+c);
    }catch(ArithmeticException e){
      System.out.println("例外をキャッチしました");
      System.out.println(e);
    }finally{
      sc.close();
      System.out.println("クローズしました");
    }
    System.out.println("プログラムを終了します");
  }
}
