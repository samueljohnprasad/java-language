package oop1;

public class MethodOverridingVsOverLoading {

    //methoding overloading -two or more methods in a same class or its subclass  with 
    //same method name but different parameters 
    //return type may or may not be different 
    //compiler time polymorphism
    //we can overloading static and instance methods

    //method overriding means defining a method in child class that already exists in parent class with same signature (same name ,same arguement)
    //by extending parent class ,child class gets all methods in the  parent class 
    //runtime polymorphism
    //cant override static methods
    //return type can be a subclass of the return type in the parent class,covariant return type
    //it cant have lower acess modifier 1.public 2.protected 3.private

    //note. methods can only be overridden in child classes 
    //Constructors and private,final methods cannot be overridden
    //subclass can use super.methodName(); to class method from superclass
    




    public static void main (String args[]){
        //overriding 
      germansheperd g=new germansheperd();
     g.bark();

    Dogg d=new Dogg();
    d.bark();

    //overloading
    Cat c =new Cat();
    c.meow();
    c.meow(2);

    }
   

    
}

//method overriding 
class Dogg{
    //parent class get methodsof child class in method overriding
    //child class gets the methods of parent class
    public void bark (){
System.out.println("woof");
    }


}
class germansheperd extends Dogg{
    // @Override
    // public void bark(){
    //     System.out.println("woof woof woof");

   // }
}




//method overloading
class Cat{
    public void meow (){
        System.out.println("meow");
    }

    public void meow(int num){
        for(int i=0;i<num;i++){
            System.out.println("Meow Meow Meow");

        }
    }
}


//covariant return type 
class Burger{

}
class HealthyBurger extends Burger{

}

class BurgerFactory {
    public Burger CreateBurger(){
        return new Burger();

    }

}
class HealthBurgerFactory extends BurgerFactory{
    public HealthyBurger CreateBurger(){
        return new HealthyBurger();
    }
}
