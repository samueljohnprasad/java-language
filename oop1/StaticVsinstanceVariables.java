package oop1;

public class StaticVsinstanceVariables {

    public static void main(String aa[]){
        //static 
        fox rex=new fox("cute");
        fox puppy=new fox("foxy");
        rex.printName();   //prints foxy
        puppy.printName(); //prints foxy

        lion dexter=new lion("dexter");
        lion  nyla=new lion("nyla");    
        dexter.printName();   //prints foxy
        nyla.printName(); //prints foxy

    }

    
}
//static variables- static variables are same for all instance of the classes
class fox{
    public static String name;
    public fox(String name){
        fox.name=name;    //static variables should be accessed with class 

    }
    public void printName(){
        System.out.println("name "+ name);
    }
}

//instance variables
//dont use static keyword
//every instance has its own copy of instance variable
//every instnace has its own value

class lion{
    public String name;
    public lion(String name){
        this.name=name;    //static variables should be accessed with class 

    }
    public void printName(){
        System.out.println("name "+ name);
    }
}
