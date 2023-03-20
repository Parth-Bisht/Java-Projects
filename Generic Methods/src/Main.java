import java.util.ArrayList;
import java.util.List;

class Data{
    public<E> void printListData(List<E> list){
        for(E element: list){
            System.out.println(element);
        }
    }
    public <E> void printArrayData(E[] arrayData){
        for(E element: arrayData){
            System.out.println(element);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Data data = new Data();
        data.printListData(list);

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");

        data.printListData(list2);

        String[] stringArray = {"ONE","TWO","THREE"};
        Integer[] integerArray = {1,2,3,4};
        Data data1 = new Data();
        data1.printArrayData(stringArray);
        data1.printArrayData(integerArray);
    }
}