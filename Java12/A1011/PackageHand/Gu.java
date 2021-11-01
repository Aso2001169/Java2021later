package PackageHand;

public class Gu extends Hand{
    public Gu(String name){
        this.pname=name;
        this.handname="グー";
    }
    @Override
    protected void judge(Hand enemy){
        if(enemy instanceof Choki){
            this.isWin=true;
        }
        super.judge(enemy);
    }
    
}
