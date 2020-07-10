package oop1;

public class ReferenceObjectClass {
     //class vs object vs reference vs instance

  //lets take analog of building to understand class
  //A class is a blueprint for a house, using blueprint you can bulid as many as we want based on those plans

  //each houe you build(in otherwords, instaniate using new operator) is an object also known as instance.

  //each house you build as an address,in other words if you want to tell someone where you live ,you give them your address.this is known as reference.
  //you can copy that refrence as many as times times but there is still one house. in other we are coping the paper that has address on it not house itslef.
  //we can pas reference as parameters to  contructors and methods

    public static void main(String aa[]){

        House blueHouse=new House("blue");
        House anotherHouse=blueHouse;    //coping blueHouse address into anotherHouse.these two houses points to same House object

        System.out.println(blueHouse.getColor());    //prints blue
        System.out.println(anotherHouse.getColor());   //prints blue

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor());    //prints red
        System.out.println(anotherHouse.getColor());   //prints red

        House greenHouse=new House("green");
        anotherHouse=greenHouse;

        System.out.println(blueHouse.getColor());    //prints red
        System.out.println(greenHouse.getColor());   //prints green
        System.out.println(anotherHouse.getColor());    //prints green
        


        




    }
    
}
class House{
    private String color;

    House(String color){
        this.color=color;

    }

    public String  getColor(){
       return this.color;
    }
    public void   setColor(String color){
        this.color=color;
     }
}