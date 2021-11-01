package packageMario;
//FireMarioクラスはMarioクラスを継承しています
  public class FireMario extends Mario{
    public void fireBall(){
      System.out.printf("%s fireBall!!",this.getClass().getName());
    }
    //スーパークラスのジャンプメソッドをオーバーライドする
    @Override
    public void jump(){
      System.out.printf("%s 燃え燃えジャンプ！\n",this.getClass().getName());
      //親クラス(super)のジャンプを呼び出す
      super.jump();
    }
  }
