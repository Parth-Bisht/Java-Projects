import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("bike",1222);
        Vehicle car = new Vehicle("car",1234);

        try(FileOutputStream fos = new FileOutputStream("vehicle.dat")) {
            try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("Object written onto the file");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO exception");
        }
    }
}