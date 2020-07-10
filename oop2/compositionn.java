package oop2;

public class compositionn {
    public static void main(String aa[]){

        Wall wall1 =new Wall ("east");
        Wall wall2 =new Wall("west");
        Wall wall3 =new Wall ("north");
        Wall wall4= new Wall ("south");

        Ceiling ceiling =new Ceiling(12,55);
        Bed bed =new Bed("modern",4,3,2,1);
        Lamp lamp =new Lamp("classic ",false,75);

        Bedroom bedroom =new Bedroom("sam",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }

    
}

class Bedroom{
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling Ceiling ;
    private Bed bed;
    private Lamp lamp;
    
    
    public Bedroom (String name,Wall wall1,Wall wall2,Wall wall3,Wall wall4,Ceiling ceiling ,Bed bed,Lamp lamp){
        this.wall1=wall2;
        this.name=name;
        this.wall2=wall2;
        this.wall3=wall3;
        this.wall4=wall4;
        this.Ceiling=ceiling;
        this.bed=bed;
        this.lamp=lamp;


    }

    public Lamp getLamp(){
        return lamp;


    }
    public  void makeBed(){
        System.out.println("BedRoom ->makeBed");
        bed.make();


    }
}

class Wall{
    private String direction;

    public Wall(String direction){
        this.direction=direction;

    }
    public String getDirection(){
        return direction;
    }
}

class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling (int height,int paintedColor){
        this.height=height;
        this.paintedColor=paintedColor;

    }
    public int getHeight(){
        return height;

    }
    public int getPaintedColor(){
        return paintedColor;
    }
}

class Bed {
    private String styles;
    private int pillows;
    private int sheets;
    private int heights;
    private int quilts;

    public Bed (String styles,int pillows ,int sheets,int heights,int quilts){
        this.styles=styles;
        this.pillows=pillows;
        this.sheets=sheets;
        this.heights=heights;
        this.quilts=quilts;

    }
    public void make(){
        System.out.println("Bed->making");
    }

    public String getStyles(){
        return styles;

    }
    public int getPillows(){
        return pillows;

    }
    public int getSheets(){
        return sheets;

    }
    public int getHeights(){
        return heights;

    }
    public int getQuilts(){
        return quilts;

    }
}

class Lamp{
    private String style;
    private boolean batery;
    private int globRating;

    public Lamp(String style,boolean batery,int globrating ){
        this.style=style;
        this.batery=batery;
        this.globRating=globrating;
        
    }

    public void turnOn(){
        System.out.println("Lamp -> turning on");
    }

    public String getStyle(){
        return style;
    }
    public boolean getBatery(){
        return batery;
    }
    public int getGlobrating (){
        return globRating;
    }
}