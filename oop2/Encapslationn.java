package oop2;

public class Encapslationn {
    public static void main(String aa[]){
        //without encapslation

        Player player =new Player();
        player.health=20;
        player.name="sam";
        player.weapon="sword";

        int damage=10;
        player.looseHealth(damage);

        System.out.println(player.healthRemaining());

        damage=11;
        player.health=20;
        player.looseHealth(damage);

        System.out.println(player.healthRemaining());


        //enhancedPlayer
        //with encapslation
        EnhancedPlayer p=new EnhancedPlayer("sam",200,"sword");
        System.out.println("intial health is "+p.getHealth());




    }
    
}
class Player {
    public String name;
    public int health;
    public String weapon;


    public void looseHealth(int damage){
        this.health=this.health-damage;
        if(this.health<=0){
            System.out.println("player is knocked out");

        }


    }

    public int healthRemaining(){
        return this.health;

    }
}


class EnhancedPlayer{
    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name,int health,String weapon){
        this.name=name;

        if(health>0&&health <100){
            this.health=health;
        }
        this.weapon=weapon;
    }   

    public void looseHealth(int damage){
        this.health=this.health-damage;

        System.out.println("player is knocked out");
    }

    public int getHealth(){
        return this.health;
    }


}