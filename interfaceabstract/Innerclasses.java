package interfaceabstract;
import java.util.ArrayList;
import java.util.Scanner;

public class Innerclasses {

    private static Scanner sc =new Scanner(System.in);
    private static Button btnPrint=new Button("print hello");
    public static void main(String a []){
        // Gearbox tesla=new Gearbox(6);
        // // Gearbox.Gear first=  tesla.new Gear(1,12.3);   //creating instance for inner class
        // // System.out.println(first.driveSpeed(100));

        // tesla.addGear(1,5.3);
        // tesla.addGear(2,10.6);
        // tesla.addGear(3,15.9);
        // tesla.operateClutch(true);
        // tesla.changeGear(1);
        // tesla.operateClutch(false);
        // System.out.println("wheelspeed "+tesla.wheelSpeed(1000));
        // tesla.changeGear(2);
        // System.out.println(tesla.wheelSpeed(3000));
        // tesla.operateClutch(true);
        // tesla.changeGear(3);
        // tesla.operateClutch(false);
        // System.out.println("wheelspeed "+tesla.wheelSpeed(6000));


        //local class
        // class ClickListener implements Button.OnClickListener{
        //     public ClickListener(){
        //         System.out.println("I'have been attached");
        //     }

        //     public void onClick(String title){
        //         System.out.println(title+" was clicked");
        //     }
        // }

       // btnPrint.setOnClickListener(new ClickListener());
        //anonymous class


        btnPrint.setOnClickListener(new Button.OnClickListener(){
            public void onClick(String title){
                System.out.println(title+" was clicked");

            }
        });
        listen();
    }

    private static void listen(){
        boolean quit=false;
        while(!quit){
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 0:
                quit=true;
                break;
                case 1:
                btnPrint.onClicku();
            }
        }
    }
    
}

 class Gearbox{
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear=0; 
    private boolean clutchIsIn;

    public Gearbox(int maxGear){
        this.maxGear=maxGear;
        this.gears=new ArrayList<>();
        Gear neutral=new Gear(0,0.0);
        this.gears.add(neutral);

      for(int i=0;i<maxGear;i++){
            addGear(i,i*5.3);
         }
     }

    public void operateClutch(boolean in){
        this.clutchIsIn=in;

    }
    public void addGear(int num, double ratio){
        if(num>0 && num<=maxGear){
            this.gears.add(new Gear(num,ratio));

        }
    }

    public void changeGear(int newGear){
        if(newGear>0 && newGear<=maxGear&&this.clutchIsIn){
            Gearbox.this.currentGear=newGear;
            System.out.println("gear "+newGear+" selected");
        }else{
            System.out.println("lol crashed");
            currentGear=0;
        }

    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("screram");
            return 0.1;
        }

        return revs* gears.get(currentGear).getRatio();
    }



    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber,double ratio){
            this.gearNumber=gearNumber;    //Gearbox.this.gearNumber=newGear; to access outer class viariable this same name
            this.ratio=ratio;

        }

        public double getRatio(){
            return this.ratio;
        }
        public double driveSpeed(int revs){
            return revs *(this.ratio);

        }


    }

}

class Button {
    private String title;
    private OnClickListener onClickListener;


    public Button(String title){
        this.title=title;

    }

    public String getTitle(){
        return this.title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener=onClickListener;
    }

    public  void onClicku(){
        this.onClickListener.onClick(this.title);
    }





    public interface OnClickListener{
        public void onClick(String title);
    }

}