package arrays;

import java.util.ArrayList;

public class AutoboxingChallenge {
    public static void main(String aa[]){

        Bank bank =new Bank("indian bank");
        bank.addBranch("hyderabad");
        bank.addCustomer("hyderabad","sam",50.4);
        bank.addCustomer("hyderabad","john",120.3);

        bank.addBranch("banglore");
        bank.addCustomer("banglore","mike",304.3);
        bank.addCustomer("banglore","tony",24.2);

        bank.addCustomerTransaction("hyderabad","sam",4.2);
        bank.addCustomerTransaction("banglore","tony",4.5);

        bank.listCustomer("hyderabad",true);
        bank.listCustomer("banglore",true);

        bank.addBranch("melbrone");
        if(!bank.addCustomer("melbrone","apple",10.2)){
            System.out.println("not created");

        }



    }
    
}
class Customer{
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double initialAmount){
        this.name=name;
        this.transactions=new ArrayList<Double>();
        addTransactions(initialAmount);

    }
    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    public String getName(){
        return this.name;

    }
    public ArrayList<Double> getTransactions(){
        return this.transactions;

    }
    
}
class Branch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name=name;
        this.customers=new ArrayList<Customer>();


    }
    public String getName(){
        return this.name;
    }

    public ArrayList<Customer> getCustomer(){
        return this.customers;
    }
    public boolean newCustomer(String customer,double initialAmount){
        if(findCustomer(customer)==null){
            this.customers.add(new Customer(customer,initialAmount));
            return true;

        }
        return false;

    }
    public boolean addCustomerTransaction(String customer,double initialAmount){

        Customer  existingCustomer=findCustomer(customer);
        if(existingCustomer!=null){
            existingCustomer.addTransactions(initialAmount);
            return true;


        }
        return false;

    }



    private Customer findCustomer(String name){
        for(int i=0;i<customers.size();i++){
            Customer checkedCustomer=this.customers.get(i);
            if(checkedCustomer.getName().equals(name)){
                return checkedCustomer;

            }

        }
        return null;

    }
}

class Bank{
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name=name;
        this.branches=new ArrayList<Branch>();

    }
    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;

        }
        return false;

    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branch=findBranch(branchName);
        if(branch!=null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;

    }

    public boolean addCustomerTransaction(String branchName,String customer ,double initialAmount){
        Branch branch =findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customer, initialAmount);


        }
        return false;

    }

    private Branch findBranch(String customerName){
       for(int i=0;i<this.branches.size();i++){
           Branch checkedBranch=branches.get(i);

           if(checkedBranch.getName().equals(customerName)){
               return checkedBranch;

           }

       }
       return null;

    }

    public boolean listCustomer(String branchName,boolean showTransactions){
        Branch branch=findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer details for branch "+branch.getName());

            ArrayList<Customer> branchCustomers=branch.getCustomer();
            for(int i=0;i<branchCustomers.size();i++){

                Customer branchCustomer=branchCustomers.get(i);
                System.out.println("customer "+branchCustomer.getName()+" ["+(i+1)+"]");
                if(showTransactions){
                    System.out.println("Transaction:");
                    ArrayList<Double> transactions=branchCustomer.getTransactions();
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("["+j+"] amount:"+transactions.get(j));

                    }


                }

            }
            return true;


        }else{
            return false;
        }

    }
}