package firststeps;

public class StringToInt {
    public static void main(String []aa){
        //String to int
    String numAsString="2100";
    System.out.println("numAsString "+numAsString);

    int number=Integer.parseInt(numAsString);
    System.out.println("number "+number);

    numAsString+=1;
    number+=1;
    System.out.println("numAsString "+numAsString);
    System.out.println("number "+number);

    System.out.println();


//String to double
    numAsString="2100.125";
    System.out.println("numAsString "+numAsString);
    double num=Double.parseDouble(numAsString);
    System.out.println("double "+num);
    numAsString+=1;
    num+=1;
    System.out.println("numAsString "+numAsString);
    System.out.println("double "+num);



}
}