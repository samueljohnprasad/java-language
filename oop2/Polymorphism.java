package oop2;

public class Polymorphism {

    public static void main(String aa[]){

            for(int i=1;i<11;i++){
                Movies movie=randomMovie();
                System.out.println("movie #"+i+" :" +movie.getName());

            }  
        //randomMovie();



    }

    public static Movies randomMovie(){
        int randonNum= (int) (Math.random()*5)+1;

        System.out.println("random number genarator is "+randonNum);
        switch(randonNum){
            case 1:
            return new Jaws();

            case 2:
            return new Independenceday();

            case 3:
            return new MazeRunner();

            case 4:
            return new StarWars();

            case 5:
            return new Forgetable();

        }
        return null;
    }
    
}
class Movies{
    private String name;
    public Movies(String name){
        this.name=name;

    }
    public String plot(){
        return "no plot here";

    }

    public String getName(){
        return this.name;
    }
}


class Jaws extends Movies{
    
    public Jaws(){
        super("jaws");

    }

    public String plot(){
        return "A shark kills people";

    }

}

class Independenceday extends Movies{
    public Independenceday(){
        super("Independenceday");
    }
    public String plot(){
        return "Aliens attempt to take over the earth";
    }
}

class MazeRunner extends Movies {
    public MazeRunner(){
        super("MazerRunner");
    }

    public String plot(){
        return "kids try and escape a maze";
    }
}

class StarWars extends Movies {
    public StarWars(){
        super("StarWars");
    }

    public String plot(){
        return "Imperial forces try take the universe";
    }
}

class Forgetable extends Movies{
    public Forgetable(){
        super("forgetable");
    }

    
}
