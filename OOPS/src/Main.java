public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setSpeed(12);
//        int speed = car.getSpeed();
//        System.out.println(speed);
//
//        car.setDoors("Closed");
//        System.out.println(car.getDoors());


//        car.setDoors("closed");
//        car.setSpeed(20);
//        car.setDriver("seated");
//        car.setEngine("on");
        Car car = new Car("closed","on","seated",20);
        System.out.println(car.run());
    }
}