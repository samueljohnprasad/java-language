package oop2;

public class Polymorphism2 {
    public static void main(String aa[]){
        Car c=new Car(8,"honda");
        System.out.println(c.startEngine());
        System.out.println(c.accelarate());
        System.out.println(c.brake());

        Mitsubishi m=new Mitsubishi(8,"mit");
        System.out.println(m.startEngine());
        System.out.println(m.accelarate());
        System.out.println(m.brake());

        Ford f=new Ford(8,"ford");
        System.out.println(f.startEngine());
        System.out.println(f.accelarate());
        System.out.println(f.brake());


    }
    
}
class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders(){
        return this.cylinders;
    }
    public String getName(){
        return this.name;
    }
    public String startEngine(){
        return "Car.startEngine()";
    }
    public String accelarate(){
        return "Car.accelarate";

    }
    public String brake(){
        return "Car.brake()";
    }

}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders,String name){
       super(cylinders,name);

    }

    public String startEngine(){
        return "Mitsubishi.startEngine()";
    }
    public String accelarate(){
        return "Mitsubishi.accelarate";

    }
    public String brake(){
        return "Mitsubishi.brake()";
    }

}

class Ford extends Car{
    public Ford(int cylinders,String name){
       super(cylinders,name);

    }

    public String startEngine(){
        return getClass().getSimpleName()+"..startEngine()";
    }
    public String accelarate(){
        return getClass().getSimpleName()+"..accelarate";

    }
    public String brake(){
        return getClass().getSimpleName()+"..brake()";
    }

}

