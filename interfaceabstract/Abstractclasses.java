package interfaceabstract;

public class Abstractclasses {
    public static void main(String aa []){
        Dog dog=new Dog ("snofy");
        dog.eat();
        dog.breathe();

        Parrot parrot=new Parrot("indian parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        Penguin penguin =new Penguin("indian penguin");
        penguin.fly();


    }
    
}
 abstract class Animal{     //abstract class has constructor
    private String name;
    public Animal(String name){
        this.name=name;

    }

    public abstract void eat();
    public abstract void breathe();

    public String getName(){
        return this.name;
    }
}

 class Dog extends Animal{
    public Dog(String name){
        super(name);
    }


    public void eat(){
        System.out.println(getName()+" is eating");

    }

    public void breathe(){
        System.out.println("breathing ");

    }
}


abstract class  Bird extends Animal implements canFly{
    public Bird(String name){
        super(name);
    }
    public void eat(){
        System.out.println(getName()+" is pecking");

    }

    public void breathe(){
        System.out.println("bird breathing ");

    }

    public  void fly(){
        System.out.println(getName()+" flopping its wings");

    }
}

class Parrot extends Bird{
    public Parrot(String name){
        super(name);
    }


}



class Penguin extends Bird{
    public Penguin(String name){
        super(name);
    }
public void fly(){
    System.out.println("penguin cannot fly ,but can swim");
}

}


interface canFly{
    void fly();

}
