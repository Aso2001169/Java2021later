package packageAnimal;

public class Dog extends Animal{
  @Override
  public void cry(){
    System.out.println("わん");
  }
  public void tail(){
    System.out.println("しっぽふりふり");
  }
  
  // public abstract void jump();
  @Override
  public void jump(){
    System.out.println("JUMP!");
  }
  public void run(){
    
  }
}
