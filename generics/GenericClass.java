package generics;

import java.util.ArrayList;
 
public class GenericClass {

    public static void main(String aa[]){
    FootballPlayer sam=new FootballPlayer("sam");
    BaseballPlayer john =new BaseballPlayer("john");
    CricketPlayer sammie =new CricketPlayer("sammie");

    Team india=new Team("india");
    india.addPlayer(sam);
    india.addPlayer(john);
    india.addPlayer(sammie);

    System.out.println(india.numPlayers());

    }
}

abstract class Player{
    private String name;

    public Player(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }


}

class BaseballPlayer extends Player{
    public BaseballPlayer(String name){
        super(name);
    }
}

class FootballPlayer extends Player{
    public FootballPlayer(String name){
        super(name);
    }
}


class CricketPlayer extends Player{
    public CricketPlayer(String name){
        super(name);
    }
}







class Team{
   
    private String name;
    private int played=0;
    private int won=0;
    private int tied=0;
    private int lost=0;

    private ArrayList<Player> members=new ArrayList<>();

    public Team(String name){
        this.name=name;
    }


    public String getName(){
        return this.name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName()+" is already on this team");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" is addded in this "+this.name);
            return true;
        }

    }



    public int numPlayers(){
        return this.members.size();
    }

    public void matchResults(Team opponent,int ourScore,int theirScore ){
        if(ourScore>theirScore){
            won++;
        }else if(ourScore==theirScore){
            tied++;
        }else{
            lost++;

        }
        played++;
        if(opponent!=null){
        opponent.matchResults(null,theirScore,ourScore);
        }

    }
    public int ranking(){
        return (won*2)+tied;
    }
    
}