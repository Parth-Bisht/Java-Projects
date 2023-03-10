public class SumOfDigit {
    public static void main(String[] args){
        int value = 1234;
        int sumOfDigits = 0;
        while(true){
            sumOfDigits = sumOfDigits + (value%10);
            value = value/10;
            if(value<10) break;
        }
        sumOfDigits += value;
        System.out.println(sumOfDigits);
    }
}
