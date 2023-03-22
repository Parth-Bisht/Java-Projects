import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.delete()){
            System.out.println("File Deleted");
        }
        else System.out.println("Error while deleting");
    }
}