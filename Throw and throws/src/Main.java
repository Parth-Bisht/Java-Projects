import java.io.FileNotFoundException;
import java.io.FileReader;

class UserDefinedException extends Exception{

}

public class Main {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (FileNotFoundException e) {
            System.out.println("catch block of main method");
        } catch(UserDefinedException e){
            e.printStackTrace();
            System.out.println();
        }catch(Exception e){
            System.out.println("catch block of main method exception");
        }
    }

    public static void someMethod() throws Exception {
//        FileReader in = new FileReader("file.txt");
//        System.out.println("Message from someMethod!");
//        throw new FileNotFoundException();
        //user defined exception

        int x = 4;

        switch(x){
            case 1: throw new FileNotFoundException();
            case 2: throw new Exception();
            default: throw new UserDefinedException();
        }
    }
}