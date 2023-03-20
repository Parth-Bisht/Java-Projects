import java.util.*;
class Data<T>{
    private T myVariable;

    public Data(T myVariable) {
        this.myVariable = myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    @Override
    public String toString() {
        return "Data{" +
                "myVariable=" + myVariable +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
//        List<Data<Object>> elements = new LinkedList<>();
//        elements.add(new Data<Object>("Parth"));
//        elements.add(new Data<Object>(1.0));
//        elements.add(new Data<Object>(2));
//        elements.add(new Data<Object>('%'));
//        elements.add(new Data<Object>(5.0f));

        //generic
        List<Data<Integer>> elements = new LinkedList<>();
        elements.add(new Data<Integer>(1));
        elements.add(new Data<Integer>(2));
        elements.add(new Data<Integer>(3));
        elements.add(new Data<Integer>(4));
        elements.add(new Data<Integer>(5));



        Main app = new Main();
        app.printList(elements);


//        Collections.sort(elements); //because of different data types it is not able to sort the data

    }

    void printList(List<Data<Integer>> list){
        ListIterator<Data<Integer>> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println("Element "+iterator.next().getMyVariable());
        }
    }
}