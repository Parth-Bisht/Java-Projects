import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Parth");
//        set.add("John");
//        set.add("Mia");
//        set.add("Parth");
//
//        for(String name: set){
//            System.out.println(name);
//        }
//        System.out.println(set.contains("Mia"));

        Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
//        Set<String> set = new TreeSet<>();
        for(int i=30;i>0;i--){
            set.add("A"+i);
        }
        for(String i: set){
            System.out.println(i);
        }
    }
}