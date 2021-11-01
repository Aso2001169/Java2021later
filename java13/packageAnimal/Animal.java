package packageAnimal;
public abstract class Animal {
  public abstract void cry();
  public abstract void jump();
  public final void run(){
    System.out.println("running!");
  }
}
