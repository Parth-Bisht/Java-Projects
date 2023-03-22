import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("javaDir");
        file.mkdir();
        file = new File("javaDir\\team.txt");
//        try {
//            file.createNewFile();
//            System.out.println("file created");
//        } catch (IOException e) {
//            System.out.println("error occured");
//        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            bw.write("Parth"); //always write
            bw.newLine();
            bw.write("selmon");
            bw.write("bhai");
            bw.newLine();
            bw.write("sanju");
            System.out.println("Writing onto the file completed");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("error occured, while writing onto the file completed");
        }
    }
}