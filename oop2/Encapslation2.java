package oop2;

public class Encapslation2 {

    public static void main(String aa[]){
        Printer printer=new Printer(50,true);
      //  printer.addToner(3);
        int pagesPrinted=printer.printPages(9);
        System.out.println("pages printed was "+pagesPrinted+". new total "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(3);
        System.out.println("pages printed was "+pagesPrinted+". new total "+printer.getPagesPrinted());
       


    }
    
}
class Printer{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer (int tonerLevel,boolean duplex){
        if(tonerLevel>-1&&tonerLevel<=100){
            this.tonerLevel=tonerLevel;


        }else{
            this.tonerLevel=-1;

        }
        this.duplex=duplex;
        this.pagesPrinted=0;

    }
    public int addToner(int tonerAmount){
        if(tonerAmount>-1&& tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;

            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;


        }else{
            return-1;
        }

    }

    public int printPages(int pages){
        int pagestoPrint=pages;
        if(this.duplex){
             pagestoPrint=(pages/2)+(pages%2);
            System.out.println("printing in duplex mode");

        }
        this.pagesPrinted+=pagestoPrint;
        return pagestoPrint;

    }
    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}