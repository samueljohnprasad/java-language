package oop1;

public class StaticVsInstanceMethodss {
  
        //static methods are declared using static modifier
        //static methods canoont access instance methods and varaibles directly 
        //they are usually used for operation that dont require any data from an instance of the class
    
        //this keyword is the current instance  of a class
        //in a static method we cannot use "this" keyword 
    
        //instance methods
        //instance methods belongs to instance of the class 
        //to use instance methods we have to instaniate the class first,by using "new" keyword
    
        //instance methods can access instance methods and variables directly
        //instance methods can access static methods and variables directly
    
    
        public static void main (String aa[]){
            //static methods are called as className.MethodName(); or MethodName(); if in same class
            Calculator.printSum(2,4);
            printHello();
    
            doggy d=new doggy(); //creating instance of class 
            d.bark();    //call instance of maethod
    
    
    
        }
        public static void printHello(){
            System.out.println("hello");
    
        }
        
    }
    class Calculator {
        public static void printSum(int a,int b){
            System.out.println("sum = "+(a+b));
    
        }
    }
    
    
    
    //instance methods example 
    class doggy{
       public void bark (){
           System.out.println("woof");
       }
    }
    