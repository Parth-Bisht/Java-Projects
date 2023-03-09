public class Main {
    public static void main(String[] args) {
        int a = 25;
        float b = 42.159f;
        double result = a*a+2*(a*b)+b*b; //give more than 2 numbers after decimal
        int res = (int)(a*a+2*(a*b)+b*b); //will give only a number
        System.out.println(res);
    }
}