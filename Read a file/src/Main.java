import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("javaDir");
        file.mkdir();
        file = new File("javaDir\\team.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            bw.write("Parth"); //always write
            bw.newLine();
            bw.write("selmon");
            bw.write("bhai");
            bw.newLine();
            bw.write("sanju");
            System.out.println("Writing onto the file completed");
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("error occured, while writing onto the file completed");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("javaDir\\team.txt"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println("error occured, while reading");
        }
    }
}