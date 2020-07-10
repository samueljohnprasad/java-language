package oop1;
public class classes {

    public static void main(String []aa){
      //states(fields) and behaviours(methods)
        Car tesla =new Car();
        Car porche=new Car();

        // porche.model="sam";
        // System.out.println(porche.model);
        // System.out.println(tesla.model);
 
        
        porche.setModel("x");
        tesla.setModel("z");
        porche.getModel();
        System.out.println(porche.getModel());
        System.out.println(tesla.getModel());

        //pratice
        Account ac =new Account();
        ac.withdrawal(100);
        ac.deposit(100);
        ac.withdrawal(100);
        ac.withdrawal(100);
      


    }


    
}

 class Car{
     private int doors;
     private int wheels;
     private String color;
     private String engine;
     private String model;

     public void setModel(String model){
       String validModel=model.toLowerCase();
       if(validModel.equals("x")||validModel.equals("y")){
        this.model=model;

       }else{
         this.model="unknown";
       }
     

    }

     public void setDoors(int doors){
       this.doors=doors;

     }
     public void setWheeels(int wheels){
      this.wheels=wheels;

    }
    public void setColor(String color){
      this.color=color;

    }
    public void setEngine(String engine){
      this.engine=engine;

    }
    

    public int getDoors(){
     return  this.doors;

    }
    public int getWheels(){
      return  this.wheels;
 
     }
     public String getColor(){
      return this.color;

    }
    public String getEngine(){
      return this.engine;

    }
    public String getModel(){
      return this.model;

    }

}
    //practise
    class Account{
      private String number;
      private double balance;
      private String name;
      private String phoneNumber;


      public  void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("deposit of "+depositAmount+" is made. New balance is "+this.balance  );

      }
      public void withdrawal(double withDrawalAmount){
        if(this.balance-withDrawalAmount<0){
          System.out.println("only "+this.balance+" avaible. Withdrawal not processed");

        }else{
          this.balance-=withDrawalAmount;
          System.out.println("balance is "+this.balance + ". withdrawal of "+ withDrawalAmount+" is processed");
        }

      }


      public String getPhoneMunber(){
        return this.phoneNumber;
  
      }
      public String getCustoreName(){
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