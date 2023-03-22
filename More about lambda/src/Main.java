interface Lamda{
    abstract public void demo(int x);
}
public class Main {
    public static void main(String[] args) {
//        int x = 10;
//        Lamda lamda = new Lamda() {
//            @Override
//            public void demo() {
//                int test = 101;
//                System.out.println("Value of x: "+test);
//            }
//        };
//        lamda.demo();
//        System.out.println(test); //can't access test here

        Lamda lamda = (int x)-> System.out.println("Statement from demo method"+x);
        lamda.demo(123);
    }
}