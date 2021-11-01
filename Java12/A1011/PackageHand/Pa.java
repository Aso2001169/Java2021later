package PackageHand;

public class Pa extends Hand{
    public Pa(String name){
        this.pname=name;
        this.handname="パー";
    }
    @Override
    protected void judge(Hand enemy){
        if(enemy instanceof Gu){
            this.isWin=true;
        }
        super.judge(enemy);
    }
    
}
