interface Lamda{
    abstract public void demo();
}
public class Main {
    public static void main(String[] args) {
        int x = 10;
        Lamda lamda = new Lamda() {
            @Override
            public void demo() {
                System.out.println("Value of x: "+x);
            }
        };
        
    }
}