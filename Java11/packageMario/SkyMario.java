package packageMario;
//FireMarioクラスはMarioクラスを継承しています
  public class SkyMario extends Mario{
    public void fly(){
      System.out.printf("%s flying!!\n",this.getClass().getName());
    }
    //スーパークラスのジャンプメソッドをオーバーライドする
    @Override
    public void run(){
      System.out.printf("%s 走れません泣\n",this.getClass().getName());
    }
  }
