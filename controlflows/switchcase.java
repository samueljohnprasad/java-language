package controlflows;

public class switchcase {


  public static void main(String []aa){
        int value=1;
        if(value==1){
            System.out.println("value is 1");
        }else if(value==2){
            System.out.println("value is 2");
         }else{
            System.out.println("value is not  1 or 2");
    
          }



          int switchValue=4;

    switch(switchValue){
           case 1:
           System.out.println("value is 1");
           break; 

           case 2:
           System.out.println("value is 2");
           break; 

           case 3:
           System.out.println("value is 3");
           break; 

           case 4:case 5: case 6:
           System.out.println("value is 4 or 5 or 6");
           break;

           default:
           System.out.println("value is not 1,2,3,4,5 or 6");
           break;



    }

    //using methods
    dayOfweek(0);
    dayOfweek(1);
    dayOfweek(2);
    dayOfweek(3);
    dayOfweek(4);
    dayOfweek(5);
    dayOfweek(6);
    dayOfweek(7);
    System.out.println();
    

    dayOfWeekElse(0);
    dayOfWeekElse(1);
    dayOfWeekElse(2);
    dayOfWeekElse(3);
    dayOfWeekElse(4);
    dayOfWeekElse(5);
    dayOfWeekElse(6);
    dayOfWeekElse(7);

        
    }

    public static void dayOfweek(int day){

        switch(day){
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;


            default:
            System.out.println("inavalid");
            break;
           

        }
        
    }

    public static void dayOfWeekElse(int day){

        if(day==0){
            System.out.println("Sunday");

        }else if(day==1){
            System.out.println("Monday");

        }else if(day==2){
            System.out.println("Tuesday");

        }else if(day==3){
            System.out.println("Wednesday");

        }else if(day==4){
            System.out.println("Thursday");

        }else if(day==5){
            System.out.println("Friday");

        }else if(day==6){
            System.out.println("Saturday");

        }else{
            System.out.println("invalid");
        }

    }
    
}




    