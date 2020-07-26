package interfaceabstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class interfacechallege {
    public static void main(String aap[]){
        Player sam =new Player("tim",10,13);
        System.out.println(sam);     //automatically executes toString() method
        // System.out.println(sam.toString()); 

        saveObject(sam);
        sam.setHitPoints(8);
        System.out.println(sam);
        sam.setWeapon("knife");
        saveObject(sam);
        loadObject(sam);
        System.out.println(sam);

        Isavable werewolf= new Monster("werewolf",10,20);
        System.out.println(((Monster) werewolf).getStrength());  //typecasting
        System.out.println(werewolf.toString());
        saveObject(werewolf);
        




    }
    public static ArrayList<String> readValue(){
            ArrayList<String> values=new ArrayList<>();

            Scanner sc=new Scanner(System.in);
            boolean quit =false;
            int index=0;
            System.out.println("choose \n"+
                               "1 - to enter String\n"+
                               "0 - to quit");

            while(!quit){
                System.out.println("choose an option ");
                int choice =sc.nextInt();
                sc.nextLine();

                switch(choice){
                    case 1:
                    System.out.println("enter a String");
                    String StringInput=sc.nextLine();
                    values.add(index,StringInput);
                    index++;
                    break;
                    case 0:
                    quit=true;
                    break;
                    

                }

            }
            return values;
           
           
            
    }

    public static void saveObject(Isavable savedObject){
        for(int i=0;i<savedObject.write().size();i++){
            System.out.println("saving "+savedObject.write().get(i)+" into device storage");

        }
        
    }
    public static void loadObject(Isavable loadObject){
        ArrayList<String> values =readValue();
        loadObject.read(values);


    }
    
}
interface Isavable{
    List<String> write();
    void read(List<String> savedData);
}



class Player implements Isavable{
  
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name,int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        this.weapon="sword";

    }

    public void setName(String name){
        this.name=name;
        
    }
    public void setHitPoints(int hitPoints){
        this.hitPoints=hitPoints;
        
    }
    public void setStrength(int strength){
        this.strength=strength;
        
    }
    public void setWeapon(String weapon){
        this.weapon=weapon;
        
    }

    public String getName(){
       return name;
        
    }
    public int getHitPoints(){
        return hitPoints;
         
     }
     public int getStrength(){
        return strength;
         
     }
     public String getWeapon(){
        return weapon;
         
     }


     public String toString (){
         return "player={"+ name +"-"+hitPoints+"-"+strength+"-"+weapon+" }";
     }

     @Override
     public List<String> write() {
         List<String> values =new ArrayList<String>();
         values.add(0,this.name);
         values.add(1,""+this.hitPoints);
         values.add(2,""+this.strength);
         values.add(3,this.weapon);

        
         return values;
     }

     @Override
     public void read(List<String> savedData) {
         if(savedData!=null && savedData.size()>0){
             this.name=savedData.get(0);
             this.hitPoints=Integer.parseInt(savedData.get(1));
             this.strength=Integer.parseInt(savedData.get(2));
             this.weapon=savedData.get(3);


         }
        }
    }
class Monster implements Isavable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name,int hitPoints,int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;

    }

    public String getName(){
        return this.name;
    }

    public int getHitPoints(){
        return this.hitPoints;

    }
    public int getStrength(){
        return this.strength;
    }

    public String toString(){
        return "monter { "+ name+"/"+hitPoints+"/"+strength+" }";
    }

    public List<String> write(){
        ArrayList<String> values=new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        return values;
    }

    public void read(List<String> savedValues){
        if(savedValues!=null && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));
            this.strength=Integer.parseInt(savedValues.get(2));

        }
    }

}