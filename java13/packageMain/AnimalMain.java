package packageMain;
import packageAnimal.*;
public class AnimalMain {
  //エントリーポイント
  public static void main(String[] args){
    Animal animal=new Dog();
    animal.cry();//dog型のインスタ
    //animal.tail();
    Dog dog=(Dog)animal;
    dog.tail();
    Animal animalX=new Animal();
    dog.jump();
  }
}
