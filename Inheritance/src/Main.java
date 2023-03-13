public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("long","petrol",2,2,12,"LED");
        Car car = new Car();
        Truck truck = new Truck();
//        System.out.println(bike.getHandle());
//        System.out.println(bike.getEngine());
//        System.out.println(bike.getHandle());
//        System.out.println(bike.getWheels());
//        System.out.println(bike.getSeats());
//        System.out.println(bike);
//        System.out.println(car);
//        System.out.println(truck);
        bike.run();
    }
}