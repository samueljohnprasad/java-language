package firststeps;

public class Codeblocks {
    public static void main(String aa[]){

    
    boolean gameOver=true;
    int score=1000;
    int bonus=100;
    int level=5;

    if(gameOver){
      int finalScore=score+(level*bonus);
      finalScore+=1000;
      System.out.println("finalScore "+finalScore);

    }

     gameOver=true;
     score=1000;
     bonus=100;
     level=5;

     if(gameOver){
         int finalScore=score+(level*bonus);
         System.out.println("finalScore "+finalScore );

   }
}
    
}
//there is so much duplicated code
//using the methods we eliminate duplicated code and print same output