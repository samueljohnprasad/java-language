package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistt {
    public static Scanner sc=new Scanner(System.in);
    public static int [] baseData=new int[10];
    public static void main(String aa[]){

        System.out.println("enter input");
        getInput();
        printArray(baseData);
        resizeArr();
        System.out.println("enter 12 input");
        getInput();
        printArray(baseData);


    }
    private static void getInput(){
        for(int i=0;i<baseData.length;i++){
            baseData[i]=sc.nextInt();

        }
    }
    private static void printArray(int[] arr){
        for(int i=0;i<baseData.length;i++){
            System.out.print(" print "+arr[i]+ " ");
            System.out.println();

        }
            

    }
    public static void resizeArr(){
        int []original=baseData;
        baseData=new int[12];
        for(int i=0;i<original.length;i++){
            baseData[i]=original[i];

        }
    }
    
}
class GrocetyList{
    private ArrayList<String> grocerylist=new ArrayList<>();

    public void addGroceries(String items){
        grocerylist.add(items);


    }

    public void printGrocerylist(){
        System.out.println("youve "+grocerylist+"items in your gocerylist");
        for(int i=0;i<grocerylist.size();i++){
            System.out.println(i+1+" , "+grocerylist.get(i));



        }

    }
    public void modifyGrocey(int pos,String newItem){
        grocerylist.set(pos,newItem);
        System.out.println("grocery item "+(pos+1) +" has been modified");

    }
    
}