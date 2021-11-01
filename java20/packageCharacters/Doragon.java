package packageCharacters;
import java.util.*;
import packageIf.IFire;
import packageIf.IGameChar;
public class Doragon extends GameChar implements IFire{
    public static final String CNAME="ドラゴン";
    public static final int ATTACK_NORMAL = 0;
    public static final int ATTACK_SUPER_RATIO = 5;
    public static final int DAMAGE_BASE = 10;
    public static final int DAMAGE_SUPER = 3;
    private static int count = 0;

    public Doragon(){
        this.cName = CNAME+"その"+(++count);
        this.newMsg();
        this.init();
    }

    @Override
    protected void init() {
        this.attackNormal = ATTACK_NORMAL;
        this.attackSuperRatio = ATTACK_SUPER_RATIO;
        this.damageBase = DAMAGE_BASE;
        this.damageSuper = DAMAGE_SUPER;
        this.hp = new Random().nextInt(MAX_HP);
        this.gp = new Random().nextInt(MAX_GP);
    }
    @Override
    public boolean superAttack(IGameChar enemy, int attack) {
        return this.superAttack(enemy, attack);
    }

    @Override
    /**
     * fire 炎の一撃
     */
    public boolean fire(IGameChar enemy, int attack) {
        System.out.printf("ほのおのいちげき！\n");
        return enemy.guard(attack);
    }
}
