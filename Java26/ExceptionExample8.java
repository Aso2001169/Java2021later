public class ExceptionExample8 {
  public static void main(String[] args){
    try{
      throwMethod(0);
    }catch(IllegalArgumentException e){
      System.out.println("IllegalArgumentException発生");
    }
  }
  public static void throwMethod(int num){
    if(num==0){
      throw new IllegalArgumentException();
    }
  }
}
