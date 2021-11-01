package example04;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(){
        this("名無し",10,30);
    }

    public Animal(String name){
        this(name,10,30);
    }

    public Animal(String name,int age){
        this(name,age,30);
    }

    public Animal(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}

