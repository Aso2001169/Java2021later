public class ExceptionExample3 {
  public static void main(String[] args){
    int a=4;
    int b=0;
    try{
      int c= a/b;
      System.out.println("Cの値は"+c);
    }catch(ArithmeticException e){
      System.out.println("例外をキャッチしました");
      System.out.println(e);
    }
    System.out.println("プログラムを修了します");
  }
}
