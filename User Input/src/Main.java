import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Whats your name?");
        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
        String name = sc.next(); //wait until user input something
//        int age = sc.nextInt(); //for integer
        System.out.println("Hey there,"+name+".Have a nice day.");
    }
}