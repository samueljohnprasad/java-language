package arrays;

import java.util.Arrays;

public class ResVsValue {
    public static void main(String aa[]){
        int intValue=10;
        int anotherIntValue=intValue;

        System.out.println("myIntvalue "+intValue);
        System.out.println("anotherIntValue "+anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntvalue "+intValue);
        System.out.println("anotherIntValue "+anotherIntValue);

        int[] intArray=new int[5];
        int[] anotherArray=intArray;

        System.out.println("intArray "+ Arrays.toString(intArray)); 
        System.out.println("intArray "+ Arrays.toString(anotherArray)); 
  
        anotherArray[0]=3;

        System.out.println("intArray after change  "+ Arrays.toString(intArray)); 
        System.out.println("intArray after change "+ Arrays.toString(anotherArray));
       
        anotherArray =new int[] {1,2,3,4,5};
        modify(intArray);
        System.out.println("intArray after modify  "+ Arrays.toString(intArray)); 
        System.out.println("intArray after modify "+ Arrays.toString(anotherArray));



    }

    private static void modify(int[] array){
        array[0]=2;
        array=new int[] {1,2,3,4,5};
       //z System.out.println(Arrays.toString(array));


    }
    
}