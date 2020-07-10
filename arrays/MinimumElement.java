package arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner sc =new Scanner(System.in);
    public static void main(String aa []){
        System.out.println("enter count");
        int count =sc.nextInt();
        sc.nextLine();
        int[] returnedArr=readIntegers(count);
        int returnedMin=findMin(returnedArr);

        System.out.println("min vaalue is "+returnedMin);

    }
    private static int[] readIntegers(int count){
        int[] array=new int[count];
        for(int i=0;i<array.length;i++){
            System.out.println("enter a number ");
            array[i]=sc.nextInt();
            sc.nextLine();
        }
        return array;

    }

    private static int findMin(int [] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            if(value<min){
                min=value;

            }

        }

        return min;

    }


    
}