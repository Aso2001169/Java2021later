package PackageHand;

public class Hand {
    protected String pname;
    protected String handname;
    protected boolean isWin=false;

    public void judgeEven(Hand enemy){
        if(enemy.getClass().equals(this.getClass())){
            System.out.printf("%sであいこです\n",this.handname);

        }else{
            this.judge(enemy);
        }
    }
    protected void judge(Hand enemy){
        this.showMsg(this.isWin);
        enemy.showMsg(!this.isWin);
    }
    protected void showMsg(boolean fact){
        String msg=String.format("%sで%sの",this.handname,this.pname);
        if(fact){msg+="勝ち";}
        else {msg+="負け";}
        System.out.println(msg);
    }
    
}
