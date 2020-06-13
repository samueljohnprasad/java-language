package firststeps;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String []aa){
//     Scanner sc=new Scanner(System.in);

//     System.out.println("enter year of birth ");

//     boolean hasNext=sc.hasNextInt();

//     if(hasNext){
//     int year=sc.nextInt();
//     int age=2020-year;
//     sc.nextLine();
    
//     System.out.println("enter name");
//     String name=sc.nextLine();
    
//     if(age>=0 &&age<=100){
//     System.out.println("name is "+name +" age is "+age);
    
//     }else{
//         System.out.println("invalid year");
//     }
//     sc.close();
// }else{
//     System.out.println("invalid int");

// }
    
scan();
}
//program

public static void scan(){
    Scanner sc=new Scanner(System.in);

    int counter=0;
    int sum=0;

    while(true){
       
       int order=counter+1;
       System.out.println("enter numer #"+order);

       boolean isInt =sc.hasNextInt();

       if(isInt){
           int num=sc.nextInt();
           counter++;
           sum+=num;
           if(counter==10){
               break;

           }

       }else{
        System.out.println("invalid num");
       }
       sc.nextLine();

    }
    System.out.println("sum is"+sum);
    sc.close();
}

}