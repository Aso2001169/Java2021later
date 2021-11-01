package packageIf;
/**
 * @parm CHOICE_ATTACK 攻撃
 * @parm CHOICE_RECOVER 回復
 */
public interface IGameChar {
    public static final String CHOICE_ATTACK = "ごうけき";
    public static final String CHOICE_RECOVER = "かいふく";

    public default void battleChoice(){
        System.out.printf("1 %S ", CHOICE_ATTACK);
        System.out.printf("その他 %S \n", CHOICE_RECOVER);
    };
    public boolean isDead();
    public abstract void statusMsg();
    public abstract boolean attack(IGameChar enemy);
    public abstract void recover();
    public abstract boolean guard(int num);
    public abstract boolean superAttack(IGameChar enemy, int attack);
}
