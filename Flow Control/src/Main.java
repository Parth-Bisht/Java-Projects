public class Main {
    public static void main(String[] args) {
        int x = 3;
        switch (x){
            case 1: System.out.println("value is 1");
                    break;
            case 2: System.out.println("value is 2");
                    break;
            case 3: System.out.println("value is 3");
                    break;
            default: System.out.println("value not exist");
                    break;
        }

        char y = 'B';

        switch(y){
            case 'a':
            case 'A':
                System.out.println("value is a");
                        break;
            case 'b':
            case 'B':
                System.out.println("value is b");
                        break;
            default: System.out.println("value not exist");
        }

        String z = "Parth";

        switch (z.toLowerCase()){
            case "parth": System.out.println("Name is parth");
                break;
            case "author": System.out.println("Name is author");
                break;
            case "editor": System.out.println("Name is editor");
                break;
            default: System.out.println("name not exist");
                break;
        }
    }
}