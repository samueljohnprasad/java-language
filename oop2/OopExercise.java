package oop2;
public class OopExercise {
    public static void main(String aa[]){

        Humburger hum=new Humburger("basic","saus",3.50,"white");
        hum.itemizeHumberger();

        hum.addHumbergerAddition1("tomato", 0.34);
        hum.addHumbergerAddition2("saus", 1.4);
        hum.addHumbergerAddition3("onions", 2.65);
        hum.addHumbergerAddition4("pepper", 0.23);

        System.out.println(hum.itemizeHumberger());

        //

        HealthyBurger h=new HealthyBurger("cheese",1.3);
        h.addHealthyAddition("egg",2);
        h.addHealthyAddition2("chips",3.2);
        System.out.println("total healthy burger price is "+h.itemizeHumberger());

        DeluxBurger d=new DeluxBurger();
        d.itemizeHumberger();
        d.addHumbergerAddition1("not", 12.4);



    }
    
}
class Humburger{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;



    public Humburger(String name,String meat,double price,String breadRollType){
        this.name=name;
        this.meat=meat;
        this.price=price;
        this.breadRollType=breadRollType;


    }
    public void  addHumbergerAddition1(String name,double price){
        this.addition1Name=name;
        this.addition1Price=price;  


    }
    public void  addHumbergerAddition2(String name,double price){
        this.addition2Name=name;
        this.addition2Price=price;  


    }
    public void  addHumbergerAddition3(String name,double price){
        this.addition3Name=name;
        this.addition3Price=price;  


    }
    public void  addHumbergerAddition4(String name,double price){
        this.addition4Name=name;
        this.addition4Price=price;  


    }

    public double itemizeHumberger(){
        double hamburgerPrice=this.price;
        System.out.println(this.name+" hamburger on a "+this.breadRollType+" roll"+" price is "+this.price);

        if(addition1Name!=null){
            hamburgerPrice+=this.addition1Price;
            System.out.println("added "+this.addition1Name+" for an extra price"+this.addition1Price);

        }
        if(addition2Name!=null){
            hamburgerPrice+=this.addition2Price;
            System.out.println("added "+this.addition2Name+" for an extra price"+this.addition2Price);

        }
        if(addition3Name!=null){
            hamburgerPrice+=this.addition3Price;
            System.out.println("added "+this.addition3Name+" for an extra price"+this.addition3Price);

        }
        if(addition4Name!=null){
            hamburgerPrice+=this.addition4Price;
            System.out.println("added "+this.addition4Name+" for an extra price"+this.addition4Price);

        }
        return hamburgerPrice;
    }
    

}


class HealthyBurger extends Humburger{
    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat,double price){
        super("healthy",meat,price,"brown rye");
        

    }

    public void addHealthyAddition(String name,double price){
        this.healthyExtraName=name;
        this.healthyExtraPrice=price;


    }
    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;

    }

    public double itemizeHumberger(){
        double hamburgerPrice=super.itemizeHumberger(); //reults from super class
       // System.out.println(this.name+" hamburger on a "+this.breadRollType+" roll"+" price is "+this.price);

        if(healthyExtraName!=null){
            hamburgerPrice+=this.healthyExtraPrice;
            System.out.println("added "+this.healthyExtraName+" for an extra price"+this.healthyExtraPrice);

        }
        if(healthyExtra2Name!=null){
            hamburgerPrice+=this.healthyExtra2Price;
            System.out.println("added "+this.healthyExtra2Name+" for an extra price"+this.healthyExtra2Price);

        }
       
        return hamburgerPrice;
    }



}
class DeluxBurger extends Humburger{
    public DeluxBurger(){
        super("delux","suas & bacon",14.2,"red");
        super.addHumbergerAddition1("chips",2.75);
        super.addHumbergerAddition2("drink",1.81);
    }


    public void  addHumbergerAddition1(String name,double price){
        System.out.println("cannot additional item to delux"); 


    }
    public void  addHumbergerAddition2(String name,double price){
        System.out.println("cannot additional item to delux");

    }
    public void  addHumbergerAddition3(String name,double price){
        System.out.println("cannot additional item to delux");


    }
    public void  addHumbergerAddition4(String name,double price){
        System.out.println("cannot additional item to delux");  


    }

}