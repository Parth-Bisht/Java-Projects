public class Truck extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String container;

    public Truck(){
        super();
        this.steering = "straight";
        this.musicSystem = "mp4";
        this.airConditioner = "small";
        this.container = "big";
    }

    public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String musicSystem, String airConditioner, String container) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", container='" + container + '\'' +
                ", getEngine()= "+ getEngine()+
                ", getWheels()="+ getWheels()+
                ", getLights()="+ getLights()+
                ", getFuelTank()="+ getFuelTank()+
                '}';
    }
}
