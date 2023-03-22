import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File directory = new File("d:\\author");
        directory.mkdirs();
        System.out.println("Directory generated");
        File file = new File("d:\\author\\test.txt");
        file.createNewFile();
        System.out.println("File generated");
    }
}