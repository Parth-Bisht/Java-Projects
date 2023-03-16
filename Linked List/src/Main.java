import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Poland");
        countries.add("Brazil");
        countries.add("Russia");
        countries.add("Thailand");
        Main app = new Main();
        app.printList(countries);
        countries.add(1,"Canada"); //add element
        app.printList(countries);
        countries.set(6,"Thyland"); // set element
        app.printList(countries);
        countries.remove(); //removes first element
        countries.remove(3); // removes from index
        app.printList(countries);

        List<String> demo = new ArrayList<>();
        demo.add("One");
        demo.add("Two");
        demo.add("Three");
        demo.add("Four");
        new Main().printList(demo);
    }
    void printList(List<String> list){
        for (String ele: list){
            System.out.println("element "+ele);
        }
        System.out.println("********");
    }

    void printIterator(List<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element "+ iterator.next());
        }
    }
}