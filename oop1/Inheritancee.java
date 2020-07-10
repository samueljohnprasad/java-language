package oop1;

public class Inheritancee {
   
        public static void main(String aa[]){
            Animal animal=new Animal("animal",1,1,5,5); Dog dog=new Dog("snofy",10,20,2,4,1,20,"silky");
    
           // dog.eat();     //can acess methods of animal class from dog class because we inherited animal class
                           //if eat() methods also exists in Dog class,then jvm excuetes eat() method in dog class but not of animal class
            
        
    
         //  dog.walk();
             dog.run();
    
    
    
        }
        
    }
    
    class Animal{
        private String name;
        private int brain;
        private int body;
        private int size;
        private int weight;
    
        Animal(String name,int brain,int body,int size,int weight){
            this.name=name;
            this.brain=brain;
            this.body=body;
            this.size=size;
            this.weight=weight;
        }
    
        public void eat(){
            System.out.println("Animal.eat() is called");
        }
        public void move(int speed){
            System.out.println("Animal.move() is called. Speed is "+ speed);
        }
    
    
        public String getName(){
            return this.name;
        }
        public int getBrain(){
            return this.brain;
        }
        public int getBody(){
            return this.body;
        }
        public int getsize(){
            return this.size;
        }
        public int getWeight(){
            return this.weight;
        }
        
    
    }
    
    
    class Dog extends Animal{
    
        private int eyes;
        private int legs;
        private int tail;
        private int teeth;
        private String coat;
    
        Dog(String name,int size,int weight,int eyes,int legs,int tail,int teeth, String coat){
            super(name,1,1,size,weight);
            this.eyes=eyes;
            this.legs=legs;
            this.tail=tail;
            this.teeth=teeth;
            this.coat=coat;
    
    
            
        }
        public void chew(){
            System.out.println("Dog.chew() is called");
        }
    
        public void eat(){
            System.out.println("Dog.eat() is called");
            this.chew();
            super.eat();                                //super executes methods in parent class
                                                      //without super or this calls methods of same class,if same method exists in parent class
        }
    
        public void walk(){
            System.out.println("Dog.walk() is called");
            move(5);
        }
        public void run(){
            System.out.println("Dog.run() is called");
            move(10);
        }
    
    
        private void movelegs(int speed){
            System.out.println("Dog.movelegs() is called");
    
        }
        public void move(int speed){
            System.out.println("Dog.move() is called");
            movelegs(speed);
            super.move(speed);
    
        }
    }
    
    