public class constructors {

    public static void main(String aa[]){
        //you can use construtor to assigh private variables instead of setters

       // Accountt ac=new Accountt("900043",200.0,"sam","900");
    //    Accountt ac=new Accountt();
    //     ac.withdrawal(100);
    //     System.out.println(ac.getName());

        Accountt john =new Accountt("9987","john","9000");
        System.out.println(john.getName());





    }

    
}

class Accountt{
    private String number;
    private double balance;
    private String name;
    private String phoneNumber;

    //constrctor shouldbe name of the class
    //you can use construtor to assigh private variables instead of setters

    Accountt(){
        this("437323",100.0,"sam","9000");  //"this" should be first in the constructor
                                            //default values
        System.out.println("empty constructor called");  
        
    }

    Accountt(String number,double balance,String name,String phoneNumber){
        System.out.println("constructor with parameters called");
        this.number=number;
        this.balance=balance;
        this.name=name;
        this.phoneNumber=phoneNumber;

    }
    Accountt(String number,String name,String phoneNumber){
       
       this(number,99.0,name,phoneNumber);
       System.out.println("constructor with 3 parameters called");

    }


    public  void deposit(double depositAmount){
      this.balance+=depositAmount;
      System.out.println("deposit of "+depositAmount+" is made. New balance is "+this.balance  );

    }
    public void withdrawal(double withDrawalAmount){
      if(this.balance-withDrawalAmount<0){
        System.out.println("only "+this.balance+" avaible. Withdrawal not processed");

      }else{
        this.balance-=withDrawalAmount;
        System.out.println("remaining balance is "+this.balance + ". withdrawal of "+ withDrawalAmount+" is processed");
      }

    }


    public String getPhoneMunber(){
      return this.phoneNumber;

    }
    public String getName(){
      return this.name;

    }

    public double getBalance(){
      return this.balance;

    }
    public String getNumber(){
      return this.number;

    }

    public void setNumber(String number){
       this.number=number;

    }
    public void setBalance(double balance){
      this.balance=balance;

   }
   public void setName(String name){
    this.name=name;

 }
 public void setPhoneNumber(String phoneNumber){
  this.phoneNumber=phoneNumber;

}

    



  }