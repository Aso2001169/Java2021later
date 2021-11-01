package java06;
public class Stringtest{
  public static void main(String[] args){
    //stringクラス
    String s1=new String("こんにちは");
    String s2=new String("こんにちは");
    if(s1.equals(s2)){
      System.out.printf("s1とs２は同じ言葉「%s」です",s1);
    }
    if(s1==s2){
      System.out.println("s1とs２の参照先のアドレスは同じ");
    }else{
      System.out.println("s1とs2の参照先のアドレスは異なる");
    }
    //s3を宣言してs2をコピー
    String s3=s2;
    if(s2.equals(s3)){
      System.out.printf("s2とs3は同じ言葉「%s」です",s3);
    }
    if(s2==s3){
      System.out.println("s2とs3は参照先アドレスは同じ");
    }else{
      System.out.println("s2とs3は参照先アドレスは異なる");
    }
    s1="こんにちは";s2="こんにちは";
    if(s1.equals(s2)){
      System.out.printf("s2とs3は同じ言葉「%s」です",s2);
    }
    if(s1==s2){
      System.out.println("s2とs3は参照先アドレスは同じ");
    }else{
      System.out.println("s2とs3は参照先アドレスは異なる");
    }

  }
}