import java.util.*;

class Names implements Comparable<Names>{
    private String name;

    public Names(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Names obj) {
        if(name.length()==obj.name.length()){
            return 0;
        }else if(name.length()<obj.name.length()){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
//        String x = "a";
//        String y = "b";
//        x.compareTo(y);
        List<Object> elements = new LinkedList<>();
        elements.add(new Names("Parth"));
        elements.add(new Names("John"));
        elements.add(new Names("Ed"));
        elements.add(new Names("Mia"));
        elements.add("Some string");
        elements.add(1);
        elements.add(2.0);
        elements.add('#');

        Main app = new Main();
        app.printList(elements);


//        Collections.sort(elements); //because of different data types it is not able to sort the data

    }

    void printList(List<Object> list){
        ListIterator<Object> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Element "+iterator.next());
        }
    }
}