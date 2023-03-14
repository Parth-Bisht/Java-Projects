public abstract class Person implements IsAlive,LiveLife {
    public void speak(){
        System.out.println("Hello");
    }

    public abstract void eat();

    @Override
    public void breathe() {
        System.out.println("be alive");
    }

    @Override
    public void message() {
        System.out.println("Life is a journey");
    }
}
