package package2;

import package1.Animal;

public class Dog extends Animal {
    public void test(){        
        name = "二コラ";
        age = 1;
        weight = 12;

        testPublic();     //OK
        testProtected();  //OK
        testPrivate();   //NG
    }
}
