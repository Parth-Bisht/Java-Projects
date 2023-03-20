import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> student = new HashMap<>();
        student.put(1,"Parth");
        student.put(2,"Rahul");
        student.put(3,"Mia");
        student.put(4,"John");

//        for(Map.Entry<Integer,String> entry: student.entrySet()){
//            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
//        }
//        System.out.println(student.get(3));

//        for(Integer key: student.keySet()){
//            System.out.println("Key: "+key+" Value:"+student.get(key));
//        }

        Iterator<Map.Entry<Integer,String>> entry = student.entrySet().iterator();
        while(entry.hasNext()){
            Map.Entry<Integer,String> temp = entry.next();
            System.out.println("Key: "+temp.getKey()+" Value: "+temp.getValue());
        }

    }
}