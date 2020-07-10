package arrays;
import java.util.Scanner;

public class arrayschallenge {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String aa[]){
        int[] myInteger=getInteger(5);

    }
    public static int[] getInteger(int num){
        int[] values=new int[num];
        for(int i=0;i<values.length;i++){
            values[i]=sc.nextInt();

        }
        return values;


    }
    public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("element "+i+" contents "+arr[i]);


        }

    }
    public static int[] sortIntegers(int[] arr){
        int[] sortArr=new int[arr.length];
        for(int i=0;i<sortArr.length;i++){
            sortArr[i]=arr[i];

        }
        boolean flag = true;
        int temp;
        while(flag){
            flag=false;
        for(int i=0;i<sortArr.length-1;i++){
            if(sortArr[i]<sortArr[i+1]){
                temp=sortArr[i];
                sortArr[i]=sortArr[i+1];
                sortArr[i+1]=temp;
                flag=true;

            }
        }
    }
    return sortArr;


    }
    
}
