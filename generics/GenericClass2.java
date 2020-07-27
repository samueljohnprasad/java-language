package generics;
import java.util.ArrayList;

public class GenericClass2 {
  
        public static void main(String aa[]){
        FootballPlayerr sam=new FootballPlayerr("sam");
        BaseballPlayerr john =new BaseballPlayerr("john");
        CricketPlayerr sammie =new CricketPlayerr("sammie");
    
        Teamm<FootballPlayerr> india=new Teamm<>("india");  //now it accepts only classs of FootballPlayerr type
         india.addPlayer(sam);
        // india.addPlayer(john); //it wont accept BaseballPlayerr/CricketPlayerr type parameter(class object)
        // india.addPlayer(sammie);

        // Teamm<String> brokenToken=new Teamm<>("ameirca");  //this gets us to Runtime error. because String is type casted into Player object/class  in addplayer method.  
        //                                                    //to remove error ,type Team class as Team<T extends Player> and remove type casting in addPlayer  
        // brokenToken.addPlayer("no-one");
    
        System.out.println(india.numPlayers());

        Teamm<BaseballPlayerr> base=new Teamm<>("chicago clubs");
        base.addPlayer(john);

        Teamm<CricketPlayerr> Cricket=new Teamm<>("hyd");
        Cricket.addPlayer(sammie);

        Teamm<FootballPlayerr> delhi=new Teamm<>("delhi");
        FootballPlayerr ts=new FootballPlayerr("ts");
        delhi.addPlayer(ts);

        Teamm<FootballPlayerr> chennai=new Teamm<>("chennai");
        Teamm<FootballPlayerr> sunrisers=new Teamm<>("sunrisers");

        chennai.matchResults(sunrisers, 1, 0);
        chennai.matchResults(india, 3, 8);

        india.matchResults(sunrisers, 2, 1);
       // india.matchResults(base, 1, 0);      //india is football team and bse is a baseball team
                                              //only correct type can be passed to the matchResult as parameter
                                              //so we need to define generic type of team in matchPlayer method




        System.out.println("Ranking");
        System.out.println(india.getName()+":"+india.ranking());
        System.out.println(delhi.getName()+":"+delhi.ranking());
        System.out.println(sunrisers.getName()+":"+sunrisers.ranking());
        System.out.println(chennai.getName()+":"+chennai.ranking());


        System.out.println(india.compareTo(delhi));
        System.out.println(india.compareTo(chennai));

        System.out.println(chennai.compareTo(india));
        System.out.println(delhi.compareTo(sunrisers));







    
        }
    }
    
    abstract class Playerr{
        private String name;
    
        public Playerr(String name){
            this.name=name;
    
        }
        public String getName(){
            return name;
        }
    
    
    }
    
    class BaseballPlayerr extends Player{
        public BaseballPlayerr(String name){
            super(name);
        }
    }
    
    class FootballPlayerr extends Player{
        public FootballPlayerr(String name){
            super(name);
        }
    }
    
    
    class CricketPlayerr extends Player{
        public CricketPlayerr(String name){
            super(name);
        }
    }
    
    
    
    
    
    
    
    class Teamm<T extends Player>implements Comparable<Teamm<T>>{
        //Generic of type T
        //type parameter
        //Teamm<T extends Player &Coach &Manager> //Coach and manager are interfaces 
       
        private String name;
        private int played=0;
        private int won=0;
        private int tied=0;
        private int lost=0;
    
        private ArrayList<T> members=new ArrayList<>(); // T is type parameter
    
        public Teamm(String name){
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
    
        public void matchResults(Teamm<T> opponent,int ourScore,int theirScore ){
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
        public int compareTo(Teamm<T> teamm) {
           if(this.ranking()>teamm.ranking()){
               return -1;

           }else if(this.ranking()<teamm.ranking()){

            return 1;
           }
           return 0;
           
        }
        
    }