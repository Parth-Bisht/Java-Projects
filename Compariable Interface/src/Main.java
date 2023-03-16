import java.util.List;
import java.util.ListIterator;

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
}
public class Main {
    public static void main(String[] args) {
        String x = "a";
        String y = "b";
        x.compareTo(y);
    }

    void printList(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Element "+iterator.next());
        }
    }
}