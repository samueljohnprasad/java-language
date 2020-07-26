package arrays;

import java.util.ArrayList;

public class autoboxing {
    public static void main(String aa []){
        String[] strArr=new String[10];
        int [] intArr=new int[10];

        ArrayList<String> strArrayList=new ArrayList<String>();
        strArrayList.add("hey");

       // ArrayLisyt<int> intArrList=new ArrayList<int>();  //type arguement cannot be of primitive type

       ArrayList<IntClass> intClassArrList=new ArrayList<IntClass>();
       intClassArrList.add(new IntClass(20));

       Integer integer=10;

       ArrayList<Integer> intArrList=new ArrayList<Integer>();
       for(int i=0;i<10;i++){
           intArrList.add(Integer.valueOf(i));

       }

       for(int i=0;i<10;i++){
        System.out.println(i+" -->"+intArrList.get(i).intValue());

    }

    Integer myIntValue=56;         //Integer.valueOf(56);
    int myInt=myIntValue;          //myIntValue.intValue();
    System.out.println("int "+myInt);




        
    }


    
}

class IntClass{
    private int myValue;

    IntClass(int myValue){
        this.myValue =myValue;


    }

    public void setMyValue(int myValue){
        this.myValue=myValue;

    }
    public int getMyvalue(){
        return this.myValue;
    }
}