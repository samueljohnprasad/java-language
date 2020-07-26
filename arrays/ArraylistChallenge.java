package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistChallenge {
    private static Scanner sc=new Scanner(System.in);
    private static MobilePhone mobile=new MobilePhone("9000437323");

    public static void main(String aa[]){
        boolean quit =false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("enter action: (6 to show availble actions)");
            int action =sc.nextInt();
            sc.nextLine();
            switch(action){
                case 1:
                System.out.println("\nshuting down");
                quit =true;
                break;
                case 2:
                mobile.printContacts();
                break;
                case 3:
                addNewContact();
                break;
                case 4:
                updateContact();
                break;
                case 5:
                removeContact();
                case 6:
                queryContact();
                break;
                case 7:
                printActions();
                break;




            }




        }
    }

    private static void addNewContact(){
        System.out.println("enter the contact name");
        String name=sc.nextLine();
        System.out.println("enter the phone number ");
        String phone =sc.nextLine();
        Contact newContact=Contact.createContact(name,phone); //no new keyword is used  bz it is a static method
        if(mobile.addNewContact(newContact)){
            System.out.println("new contact added,name = "+name+" phone= "+phone);

        }else{
            System.out.println("connot add "+name +"already exists on file");
        }


    }

    private static void updateContact(){
        System.out.println("enter exsting contact name");
        String name=sc.nextLine();
        Contact existingContactRecord=mobile.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;

        }
        System.out.println("enter new contact name:");
        String newName=sc.nextLine();
        System.out.println("enter new contact phone number");
        String newNumber=sc.nextLine();
        Contact newContact=Contact.createContact(newName,newNumber);
        if(mobile.upadateContact(existingContactRecord, newContact)){
            System.out.println("Successfullly updated record");

        }else{
            System.out.println("error updating");
        }
    }

    private static void removeContact(){
        System.out.println("enter exsting contact name");
        String name=sc.nextLine();
        Contact existingContactRecord=mobile.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;

        }
        if(mobile.removeContact(existingContactRecord)){
            System.out.println("sucessfully delted contact");

        }else{
            System.out.println("error deleting contact");
        }
    }

    private static void queryContact(){
        System.out.println("enter exsting contact name");
        String name=sc.nextLine();
        Contact existingContactRecord=mobile.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;

        }
      
            System.out.println("name:"+existingContactRecord.getName()+". phone number: "+existingContactRecord.getPhoneNumber());
    }



    
    private static void printActions(){
        System.out.println("\n availbale actions:\npress");
        System.out.println("1 - To shutdown\n" +
                           "2 - to print contacts\n"+
                           "3 - to add new contacts\n"+
                           "4 - to upadate an existing contact\n"+
                           "5 - to remove an existing contact\n"+
                           "6 - query if a contact exists\n"+
                           "7 - to print availble actions");
        System.out.println("choose your actions");
    }

    private static void startPhone(){
        System.out.println("starting phone....");
    }


    
}
class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;

    }
    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public static Contact createContact(String name,String phoneNumber){
        return new Contact(name,phoneNumber);

    }
}

class MobilePhone{
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<Contact>(); 
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println();
            return false;

        }
        myContacts.add(contact);
        return true;


    }

    public boolean upadateContact(Contact oldContact,Contact newContact){
        int foundPos=findContact(oldContact);
        if(foundPos<0){
            System.out.println(oldContact.getName()+" was not found");
            return false;
            

        }
        this.myContacts.set(foundPos,newContact);
        System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
        return true;

    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);

    }

    private int findContact(String contactName){
        for(int i=0;i<myContacts.size();i++){
            Contact contact=this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;

            }

        }
        return -1;

    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
           return contact.getName();

        }
        return null;

    }

    public Contact queryContact(String name){
        int pos=findContact(name);
        if(pos>=0){
        return this.myContacts.get(pos);
        }
        return null;

    }

    public boolean removeContact(Contact contact){
        int foundpos=myContacts.indexOf(contact);
        if(foundpos<0){
            System.out.println(contact.getName()+" was not found");
            return false;

        }
        this.myContacts.remove(foundpos);
        System.out.println(contact.getName()+" was removed");
        return true;

    }
    public void printContacts(){
        System.out.println("contant list");
        for(int i=0;i<myContacts.size();i++){
            System.out.println(i+1+". "+this.myContacts.get(i).getName()+"-> "+this.myContacts.get(i).getPhoneNumber());
            //myContact(class) > get(get md gets contact class) >getName()

        }
    }
}