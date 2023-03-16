import java.util.ArrayList;

public class Main {
    static ArrayList<String> listNames = new ArrayList<>();
    public static void main(String[] args) {
        listNames.add("Parth");
        listNames.add("john");
        listNames.add("steve");
        listNames.add("mia");
        listNames.add("rahul");
        Main app = new Main();
        app.displayList(listNames);
//        app.removeNameByPosition(1);
//        System.out.println("*******");
//        app.displayList(listNames);
//        app.removeNameByString("mia");
//        System.out.println("*******");
//        app.displayList(listNames);
//        System.out.println("*******");
//        app.modifyName(0,"bisht");
//        app.displayList(listNames);
       int position = app.search("Mia");
       if(position==-1){
           System.out.println("Invalid");
       }else{
           System.out.println("position "+position);
       }

//        System.out.println(listNames.get(0));
    }
    void displayList(ArrayList<String> names){
        for(String name: names){
            System.out.println(name);
        }
    }

    void removeNameByPosition(int position){
        listNames.remove(position);
    }
    void removeNameByString(String name){
        listNames.remove(name);
    }
    void modifyName(int position,String newName){
        listNames.set(position,newName);
    }
    int search(String name){
//        listNames.contains(name);
        return listNames.indexOf(name);
    }
}