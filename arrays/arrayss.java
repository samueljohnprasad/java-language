package arrays;
import java.util.Scanner;

public class arrayss {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String aa[]){
        int[] myIntegers= getIntegers(5);
        for(int i=0;i<myIntegers.length;i++){
            System.out.println("element at "+i+" typed values"+myIntegers[i]);

        }
        System.out.println("the average is "+getAverage(myIntegers));
       

    }

    public static int[] getIntegers(int number){
        System.out.println("enter "+number +" Integer values");
        int [] values=new int[number];
        for(int i=0;i<number;i++){
            values[i]=sc.nextInt();
        }

        return values;


    }
    public static double getAverage(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];


        }
        return (double) sum/(double) arr.length;

    }

    
}
