public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        if(door.isLocked(args[0])){
            System.out.println("Shop is closed");
        }else{
            System.out.println("Shop is open");
        }
    }
}