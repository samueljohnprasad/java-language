package oop1;

public class InheritanceExample {
    public static  void main(String aa[]){


    }
    
}

class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;


    public Vehicle(String name ,String size){
        this.name=name;
        this.size=size;

        this.currentVelocity=0;
        this.currentDirection=0;



    }

    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer steering at "+this.currentDirection+" degrees");

    }
    public void move(int direction,int velocity){
        this.currentDirection=direction;
        this.currentVelocity=velocity;

        System.out.println("vehicle.move(); moving at velocity "+currentVelocity +" in direction "+currentDirection );
    } 

    public String getName(){
        return this.name;
    }

    public String getSize(){
        return this.size;

    }
    public int getCurrentVelocity(){
        return currentVelocity;
    }
    public int getcurrentDirection(){
        return currentDirection;
    }
    public void stop(){
        this.currentDirection=0;
    }
}
class Carr extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private  boolean isManual;
    private int currentGear;


    Carr(String name,String size,int wheels,int doors,int gears,boolean isManual){
        super(name,size);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.currentGear=1;


    }
    public void changeGear(int currentGear){
        this.currentGear=currentGear;
        System.out.println("Carr.changeGear(); is changed to "+this.currentGear+" gear");

    }
    public void changevelocity(int velocity,int direction){
        move(velocity,direction);
        System.out.println(" carr.changevelocity(); velocity is"+velocity+" direction"+direction);

    }

}

class telsa extends Carr{
    private int roadServiceMonth;

    telsa(int wheels ,int doors ,int gears,boolean isManual,int roadServiceMonth ){
        super("telsa","40w",4,2,6,false);
        this.roadServiceMonth=roadServiceMonth;

    }

}