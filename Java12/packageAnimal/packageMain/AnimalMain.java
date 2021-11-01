package packageAnimal.packageMain;

import packageAnimal.*;

public class AnimalMain {
  //Animal一族のサブクラスの配列を作る
  
  public static void main(String[] args){
    Animal[] animalArray = new Animal[3];
    animalArray[0]=new Dog();
    animalArray[1]=new Cat();
    animalArray[2]=new Human();
    for(Animal animal:animalArray){
      animal.cry();
    }
  }
}
