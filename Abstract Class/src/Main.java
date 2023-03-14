public class Main {
    public static void main(String[] args) {
        Person john = new Vegan();
        john.speak();
        john.eat();
        john.message();
        john.breathe();
        System.out.println("********");
        Person mia = new NonVegan();
        mia.speak();
        mia.eat();
    }
}