package firststeps;

public class Ternaryoperator {

    //ternary operator means three operators

    public static void main (String arg[]) {


        //ex:1
        boolean isCar=true;

        boolean wasCar = isCar ? true:false;

        if(wasCar){
            System.out.println("was car");

        }

        //ex:2

        int age=18;

        boolean isAdutl = (age<17)? true :false;
        if(isAdutl){
            System.out.println("isadult");

        }else{
            System.out.println("not isadult");

        }
        //ex:3

        int no=18;

        int hai = (no==18)? 19 :12;   //if no==18 ,which is true then assigh hai=19;ortherwise false then assign hai=12;
        if(hai==12){
            System.out.println("true");

        }else{
            System.out.println("flase");

        }


    }
    
}