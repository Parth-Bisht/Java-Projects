public class ForLoop {
    public static void main(String[] args){
//        for(int i = 1;i<=10;i++){
//            System.out.println(i);
//        }
//        for(int i = 10; i>=0;i--){
//            System.out.println(i);
//        }
//
//        int i=10;
//        for(;;){
//            System.out.println(i);
//            if(i<=8) break;
//            i--;
//        }

        int isPrime = 1;
        int count = 0;
        for(int i=2;i<=isPrime;i++){
            if(isPrime%i==0){
                count++;
            }
        }

        if(count==1){
            System.out.println(isPrime+" is prime");
        }else if(isPrime==1){
            System.out.println(isPrime+" is not prime");
        }
        else{
            System.out.println(isPrime+" is not prime");
        }
    }
}
