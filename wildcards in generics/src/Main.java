import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int VehicleId;

    public Vehicle(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleId=" + VehicleId +
                '}';
    }
    void info(){
        System.out.println("vechicle ID is "+getVehicleId());
    }
}

class Car extends Vehicle{
    private String CarModel;

    public Car(int vehicleId,String carModel) {
        super(vehicleId);
        CarModel = carModel;
    }

    public String getCarModel() {
        return CarModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarModel='" + CarModel + '\'' +
                '}';
    }
    void info(){
        System.out.println("Car model is "+getCarModel());
    }
}
public class Main {
    public static void main(String[] args) {
//        List<Object> list = new ArrayList<>(); //can handle any data type
        List<Vehicle> list = new ArrayList<>(); // can handle only vehicle data type
        list.add(new Vehicle(10));
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));
        list.add(new Car(14,"A14"));
//        list.add(new String("A string object"));
        display(list);
    }
    public static void display(List<? extends Vehicle> list){ //upperbound, as objects of vehicle and child class of vehicle are acceptable
        for(Vehicle element: list){
//            System.out.println(element);
            element.info();
        }
    }

//    public static void display(List<? super Car> list){ //lowerbound, as objects of parent class are acceptable
//        for(Object element: list){
//            System.out.println(element);
//        }
//    }
}