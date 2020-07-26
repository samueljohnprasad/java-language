package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistt {
    private static Scanner sc=new Scanner(System.in);
    private static int [] baseData=new int[10];
    private static GroceryList grocerylist=new GroceryList();
    public static void main(String aa[]){

        // System.out.println("enter input");
        // getInput();
        // printArray(baseData);
        // resizeArr();
        // System.out.println("enter 12 input");
        // getInput();
        // printArray(baseData);

        //example
        boolean quit =false;
        int choice=0;
        printInstruction();


        while(!quit){
            System.out.println("enter your choice");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 0:
                printInstruction();
                break;
                case 1:
                grocerylist.printGrocerylist();
                break;
                case 2:
                addItem();
                break;
                case 3:
                modifyItem();
                break;
                case 4:
                removeItem();
                break;
                case 5:
                searchForItem();
                break;
                case 6:
                quit=true;
                break;


            }
        }
    }

    public static void printInstruction(){
        System.out.println("\n press");
        System.out.println("\t 0- To print choice options ");
        System.out.println("\t 1- To print list of groceryitems");
        System.out.println("\t 2- To add anitem to the list");
        System.out.println("\t 3- To modify an item from the list");
        System.out.println("\t 4- To remove an item from the list");
        System.out.println("\t 5- To search for an item in the list");
        System.out.println("\t 6- To quit the application");
    }
    public static void addItem(){
        System.out.println("please enter the grocery item");
        grocerylist.addGroceryItem(sc.nextLine());
    }
    public static void modifyItem(){
        System.out.println("enter item number ");
        int itemNo=sc.nextInt();
        sc.nextLine();
        System.out.println("enter replacement item ");
        String newItem=sc.nextLine();
        grocerylist.modifyGrocey(itemNo-1, newItem);

    }
    public static void removeItem(){
        System.out.println("enter item to  be removed");
        int itemNo=sc.nextInt();
        sc.nextLine();
        grocerylist.removeGroceryItem(itemNo);
    
    }

    public static void searchForItem(){
        System.out.println("item to search for ");
        String searchItem=sc.nextLine();
        if(grocerylist.findItem(searchItem)!=null){
            System.out.println("found "+searchItem+" in our grocerylist");
        }else{
            System.out.println(searchItem +" is not in the shopping list");
        }
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
//challenge



class GroceryList{
    private ArrayList<String> grocerylist=new ArrayList<>();

    public void addGroceryItem(String items){
        grocerylist.add(items);


    }

    public void printGrocerylist(){
        System.out.println("you ve "+grocerylist.size()+"items in your gocerylist");
        for(int i=0;i<grocerylist.size();i++){
            System.out.println(i+1+"."+grocerylist.get(i));



        }

    }
    public void modifyGrocey(int pos,String newItem){
        grocerylist.set(pos,newItem);
        System.out.println("grocery item "+(pos+1) +" has been modified");

    }

    public void removeGroceryItem(int pos){
        String item=grocerylist.get(pos);
        grocerylist.remove(pos-1);

    }
    public String findItem(String searchItem){
        //boolean exists=grocerylist.contains(searchItem);

        int pos=grocerylist.indexOf(searchItem);
        if(pos>=0){
            return grocerylist.get(pos);

        }
        return null;


    }
    
}