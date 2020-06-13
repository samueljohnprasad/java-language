package controlflows;

public class whileloop {

    public static void main(String[]aa){

        int count=0;
        while(count!=6){
            System.out.println("count is "+ count);
            count++;

        }

        System.out.println("count is "+ count);//6

        System.out.println();

        count=0;
        while(true){

            if(count==6){
                break;
            }
         System.out.println("count is "+ count);
         count++;
        }


        System.out.println();
        
        //do while loop

         count=1;

         do{
            System.out.println("count is "+ count);
            count++;

         }while(count!=6);



        //  count=6;

        //  do{
        //     System.out.println("count is "+ count);
        //     count++;

        //     if(count>15){
        //         break;

        //     }

        //  }while(count!=6);



 //program for even numbers
        int start=4;
        int end=20;

        int evens=0;

        while(start<=end){
            start++;

            if(!isEven(start)){
               continue;

            }

            evens++;
            if(evens>5)
            break;
            System.out.println(start);

        }

        System.out.println("sum is "+sumOfDigits(1));
        System.out.println("sum is "+sumOfDigits(15450));
        System.out.println("sum is "+sumOfDigits(64747));
        System.out.println("sum is "+sumOfDigits(0));
        System.out.println("sum is "+sumOfDigits(546));

    }
    //program for even numbers

    public static boolean isEven(int num){

        if((num%2)==0){
            return true;
         }
        return false;

    }

    //program for sumofdigits

    private static int sumOfDigits(int num){
        if(num<1)
        return -1;

        int sum=0;

        while(num>0){

            int digit=num%10;
            sum=sum + digit;

            num=num/10;

        }
        return sum;
    }
    
}