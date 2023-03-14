public class Main {
    public static void main(String[] args) {
        Door door = new Door();
//        System.out.println(door.getLock().isUnlocked("test"));
        if(door.getLock().isUnlocked(args[0])){
            System.out.println("Welcome, we are open");
        }else{
            System.out.println("Sorry, we are closed");
        }
    }

}