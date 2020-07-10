package oop1;

public class Superthis {
    public static void main(String aa[]){

        //"super" keyword is used to aceess/call parent class methods and variables
        //super keyword is commmonly used with method overriding,when we call method with same name from 
        //parent class 

        //"this" keyword is used to aceess/call current class methods and variables
        //this is required when we have pareamter with same name as an instance variable
        //note: we use both of them  anywhere in a class except static arrea(static blocks or static methods) any attempt will lead to 
        //compile error
        //this keyword is used in constuctors and setters and optionllay in getters.we use thhis keyword in constructor and setters
        //since there is a parameter with same name .in getter we dont have parameter with same name so thiis is optional in getter  

        //this() and super()
        // this() is used to call a constructor from another overload constructor from same class
        // this() can only be used in constructor, and must be the first statement in the constructor.
        //super() class parent constructor
        //java compiler puts default super() if we dont add it in constructor. should be the first statement
        //even abstract classes have constructors ,although you nevre instaniate the abstract class using new keyword
        //abstract class is a super class,so its constructor runs when someone makes an instance of a subclass
        // note: a constructor can have call to super() or this, but not both


        subClass s=new subClass();
        s.printMethod();

        Rectangle r=new Rectangle(1,3,3,4);
        Rectangle rr=new Rectangle(1,4);
    }
    }
    


class superClass{
    //example
    // superClass(String sam){

    // }
    public void printMethod(){
        System.out.println("print in superClass");
    }
}
class subClass extends superClass{
    //super(); in default constructor creates the object of parent class
    // since didnt instaniate the parent class in main method
    //example
    // subClass(){
    //     super("hey");
    // }
    

    public void printMethod(){
         super.printMethod();
        System.out.println("print in subClass");
        super.printMethod();
    }
}



//usecase of this() nad super()
class Shape{
    private int x;
    private int y;

    Shape(int x,int y){
        this.x=x;
        this.y=y;


    }

}
class Rectangle extends Shape{
    private int width;
    private int height;

    Rectangle(int x,int y){
       this(x,y,0,0);

    }
    Rectangle(int x,int y,int width,int height){
        super(x,y);
        this.width=width;
        this.height=height;

    }
}