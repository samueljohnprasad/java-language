package generics;

import java.util.ArrayList;
import java.util.Collections;

public class GenericChallenge {
    public static void main(String aa[]){

        League<Teamer<FootballPlayers>> foot=new League<>();

    }
    
}

class League<T extends Teamer>{ //Teamer is a raw type
    private String name;
    private ArrayList<T> league=new ArrayList<>();

    public League(String name){
        this.name=name;
    }
    public boolean add(T team){
        if(league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t:league){
            System.out.println(t.getName()+":"+t.ranking());
        }
    }
}




abstract class Players{
    private String name;

    public Players(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }


}

class BaseballPlayers extends Player{
    public BaseballPlayers(String name){
        super(name);
    }
}

class FootballPlayers extends Player{
    public FootballPlayers(String name){
        super(name);
    }
}


class CricketPlayers extends Player{
    public CricketPlayers(String name){
        super(name);
    }
}



class Teamer<T extends Player>implements Comparable<Teamer<T>>{
    //Generic of type T
    //type parameter
    //Teamm<T extends Player &Coach &Manager> //Coach and manager are interfaces 
   
    private String name;
    private int played=0;
    private int won=0;
    private int tied=0;
    private int lost=0;

    private ArrayList<T> members=new ArrayList<>(); // T is type parameter

    public Teamer(String name){
        this.name=name;
    }


    public String getName(){
        return this.name;
    }

    public boolean addPlayer(T player){
                              //type parameter
        if(members.contains(player)){
            System.out.println( player.getName()+" is already on this team");  //casting it to Player
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+" is addded in  "+this.name);
            return true;
        }

    }



    public int numPlayers(){
        return this.members.size();
    }

    public void matchResults(Teamer<T> opponent,int ourScore,int theirScore ){
        String message;
        if(ourScore>theirScore){
            won++;
            message=" beat ";
        }else if(ourScore==theirScore){
            tied++;
            message=" drew with ";
        }else{
            lost++;
            message=" lose to ";

        }
        played++;
        if(opponent!=null){
            System.out.println(this.getName()+message+opponent.getName());
        opponent.matchResults(null,theirScore,ourScore);
        }

    }
    public int ranking(){
        return (won*2)+tied;
    }

    @Override
    public int compareTo(Teamer<T> teamm) {
       if(this.ranking()>teamm.ranking()){
           return -1;

       }else if(this.ranking()<teamm.ranking()){

        return 1;
       }
       return 0;
       
    }
    
}