package PackageHand;

public class Choki extends Hand{
  public Choki(String name){
    this.pname=name;
    this.handname="チョキ";
  }
    @Override
    protected void judge(Hand enemy){
      if(enemy instanceof Pa){
        this.isWin=true;
      }
      super.judge(enemy);
    }
  
}
