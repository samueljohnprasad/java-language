package oop2;

 class Composition {
     public static void main(String aa[]){

        Dimensions dimensions =new Dimensions(40,40,5);

        Case theCase =new Case("130s","dell","400",dimensions);
        Monitor monitor =new Monitor("27inch","Acer",27,new Resolution(420,360));
        Motherboard motherboard =new Motherboard("10x","apple",4,6,"v2.3");

        PC pc =new PC(motherboard,monitor,theCase);
        pc.getMonitor().drawPixelAt(10,5,"red");
        pc.getMotherboard().loadProgram("loading windows");
        pc.getCase().pressPowerButton();
        pc.powerUp();






     }
    
}
class Motherboard{
    private String manufacture;
    private String model;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String manufacture,String model,int ramSlots,int cardSlots,String bios){
        this.manufacture=manufacture;
        this.model=model;
        this.ramSlots=ramSlots;
        this.cardSlots=cardSlots;
        this.bios=bios;

        
    }
    public String getManufacture(){
        return manufacture;

    }
    public String getModel(){
        return model;

    }
    public int getRamSlots(){
        return ramSlots;

    }
    public int getCardSlots(){
        return cardSlots;

    }
    public String getBios(){
        return bios;

    }
    public void loadProgram(String programName){
        System.out.println("program is "+programName +" loading");
    }
}

class Monitor{
    private String model;
    private String manufacture;
    private int size;

    private Resolution nativeResolution;
    
    public Monitor(String model, String manufacture, int size,Resolution nativeResolution){
        this.model=model;
        this.manufacture=manufacture;
        this.size=size;
        this.nativeResolution=nativeResolution;


    }public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing pixel at " + x +","+ y+" in color "+color);
    }



    public String getModel(){
        return model;
    }
    public String getManufacture(){
        return manufacture;

    }
    public int getSize(){
        return size;
    }
    public Resolution getNativeResolution(){
        return nativeResolution;
    }
}

class Resolution {
    private int height;
    private int width;

    public Resolution(int height,int width){
        this.height=height;
        this.width=width;
    }

    public int getHeight(){
        return height;
    }
    public int getwidth(){
        return width;
    }

}


class Case{
    private String model;
    private String manufacture;
    private String powerSupply;

    private Dimensions dimensions;

    public Case(String model,String manufacture,String powerSupply,Dimensions dimensions){
        this.model=model;
        this.manufacture =manufacture;
        this.powerSupply=powerSupply;
        this.dimensions=dimensions;


    }
    public void pressPowerButton(){
        System.out.println("power button is pressed");
    }

    public String getModel(){
        return model;

    }
    public String getmanufacture(){
        return manufacture;
    }

    public String getPowerSupply(){
        return powerSupply;
    }

    public Dimensions getDimensions(){
        return dimensions;
    }

}

class Dimensions {
    private int height;
    private int width;
    private int depth;

    public Dimensions(int height, int width, int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;

    }

    public int getWidth(){
        return width;

    }
    public int getHeight(){
        return height;

    }
    public int getDeep(){
        return depth;
    }
}

class PC{
    private Motherboard motherboard;
    private Monitor monitor;
    private Case theCase;


    public PC(Motherboard motherboard, Monitor monitor ,Case theCase){
        this.motherboard=motherboard;
        this.monitor=monitor;
        this.theCase=theCase;

    }

    public void powerUp(){
        theCase.pressPowerButton();  
        drawLogo();

    }

    private void drawLogo(){
        monitor.drawPixelAt(20,4,"black");
    }
    public Motherboard getMotherboard(){
        return motherboard;
    }
    public Monitor getMonitor(){
        return monitor;

    }
    public  Case getCase(){
        return theCase;
    }

}

