import java.util.ArrayList;
import java.util.List;

interface Lambda{
    public void demo();
}
public class Main {
    public static void main(String[] args) {
        Lambda lambda = () -> System.out.println("Hello world!");
        lambda.demo();
    }

    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Inside runable");
        }
    });

//    Thread thread1 = new Thread(()->System.out.println("Inside runnable"));
//    thread1.start();

}