package controlflows;

public class forloop {
    public static void main(String []aa){

        System.out.println(isPrime(6));

        int count=0;
        for(int i=0;i<=50;i++){
            if(isPrime(i)){
                System.out.println(i+" "+"is prime num");
                

            }

        }
        System.out.println();

        sum();

    }
    public static boolean isPrime(int num){
        if(num<=1)
        return false;

        for(int i=2;i<=num/2;i++){
            if(num%i==0)
            return false;

        }
        return true;
    }

    //challenge
    public static void sum(){
        int count=0;
        int sum=0;

        for(int i=1;i<=1000;i++){

            if(i%3==0 &&i%5==0){
                count++;
                sum+=i;
                System.out.println(i+" found");

            }
            if(count==5)
            break;

        }
        System.out.println("sum is "+sum);
    }
}