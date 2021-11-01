package PackageHand;

public class GameControl {
    private static final int GU=0,CHOKI=1,PA=2,HAND_MAX=3;
    private static Hand makehand(String pname){
        Hand player;
        int handnum=new java.util.Random().nextInt(HAND_MAX);
        switch (handnum){
            case GU:player=new Gu(pname);break;
            case CHOKI:player=new Choki(pname);break;
            case PA:default:player=new Pa(pname);break;
        }
        return player;
    }
    public static void buttle(int max,String[]pname){
        for(int i=0;i<max;i++){
            Hand p1=makehand(pname[0]);
            Hand p2=makehand(pname[1]);

            p1.judgeEven(p2);
        }
        }
    }