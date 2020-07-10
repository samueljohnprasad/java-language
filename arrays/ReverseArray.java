package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String aa[]){

        int[] arr={1,3,24,4,5,6};
        System.out.println("reverse array "+ Arrays.toString(arr));

        reverseArr(arr);
        System.out.println("reverse array "+ Arrays.toString(arr));


    }
    private static void reverseArr(int [] arr){
        int maxIndex=arr.length-1;
        int halfIndex=arr.length/2;

        for(int i=0;i<halfIndex;i++){
            int temp=arr[i];
            arr[i]=arr[maxIndex-i];
            arr[maxIndex-i]=temp;


        }


    }
    
}