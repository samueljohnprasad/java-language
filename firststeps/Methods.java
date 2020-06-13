package firststeps;

public class Methods {
    public static void main(String[]aa){
        boolean gameOver=true;
        int score=1000;
        int bonus=100;
        int level=5;
        

        gameScore(gameOver, score, bonus,level);
        gameScore(false, 1000, 100, 6);

        int pos=calculateHighScorePosition(1000);
        displayHighscoreposition("sammie",pos);

         pos=calculateHighScorePosition(600);
        displayHighscoreposition("john",pos);

        pos=calculateHighScorePosition(400);
        displayHighscoreposition("sam",pos);

        pos=calculateHighScorePosition(99);
        displayHighscoreposition("johnny",pos);

        feetandInchesToCm(7,8);


}

public static void gameScore(boolean gameOver,int score,int bonus,int level){
    if(gameOver){
        int finalScore=score+(level*bonus);
        finalScore+=1000;
        System.out.println("finalScore "+finalScore );

  }else{
    System.out.println("game resume");

  }


}

//challenge 1
//create a method called displayHighscoreposition 
//it shuld have name and position as parameter
//second method called calculatedHighScorePosition ,score as parameter




public static void  displayHighscoreposition(String name,int pos ){
    System.out.println(name+" "+pos);

}

public static int calculateHighScorePosition(int score){
    int pos;
    if(score>=1000){
         pos= 1;

    }else if(score>=500){
         pos= 2;

    }else if(score>=100){
        pos= 3;

    }else{
        pos= 4;
    }

  return pos;

}
//challenge2

public static double feetandInchesToCm(double feet,double inches){
    if((feet<0)||(inches<0) &&(inches>12)){
        System.out.println("invalid");
        return -1;

    }

    double cm=(feet*12)*2.54;
    cm+=inches*2.54;

    System.out.println(feet+"+"+inches+"="+cm);
    return cm;

}

}