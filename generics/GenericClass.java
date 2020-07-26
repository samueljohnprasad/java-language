package generics;

import java.util.ArrayList;
 
public class GenericClass {
    FootballPlayer sam=new FootballPlayer("sam");
    BaseballPlayer john =new BaseballPlayer("john");
    CricketPlayer sammie =new CricketPlayer("sammie");

    Team india=new Team("india");
    india.addPlayer(john);


    



    
}

abstract class Player{
    private String name;

    public Player(String name){
        this.name=name;

    }
    public String getName(){
        return this.name;
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




class Team {
    private String name;
    private int played;
    private int won;
    private int tied;
    private int lost;

    private ArrayList<Player> members=new ArrayList<>();

    public Team(String name){
        this.name=name;
    }


    public String getName(){
        return this.name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName()+" is already on this team")
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" is addded in this "+this.name);
            return true;
        }

    }

    public int numPlayers(){
        return members.size();
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
        opponent.matchResults(null,theirScore,ourScore);

    }
    public int ranking(){
        return (won*2)+tied;
    }
    
}