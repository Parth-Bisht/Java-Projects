public class Main {
    public static void main(String[] args) {
        Calculate prime = new Calculate();
        if(prime.isPrime(25)){
            System.out.println("Number passed is prime");
        }else{
            System.out.println("Number passed is not prime");
        }
    }
}