package exsample03;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(){
        this.name = "名無し";
        this.age = 10;
        this.weight = 30;
    }

    public Animal(String name){
        this.name = name;
        this.age = 10;
        this.weight = 30;
    }

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 30;
    }

    public Animal(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}

