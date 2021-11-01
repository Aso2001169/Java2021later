package packageComp;
//java.lang.Comparableはjava.langパッケ
public class Comp implements Comparable{
  private String data;
  public String getData(){
    return this.data;
  }
  //コンストラクタ
  public Comp(String data){
    //フィールド変数に引数を代入
    this.data=data;
  }
  @Override
  
  public int compareTo(Object o) {
    // TODO Auto-generated method stub
    if(this.data.codePointAt(0)>o.toString().codePointAt(0)){
      return 1;
    }else if(this.data.codePointAt(0)<o.toString().codePointAt(0)){
      return -1;
    }
      //else 等しいとして０を返す

    return 0;
  }
  
}
