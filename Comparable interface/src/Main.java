class Data<T extends Comparable> implements Comparable<T>{
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

    @Override
    public int compareTo(T o) {
//        return getMyVariable().compareTo(o);
        return o.compareTo(getMyVariable());
    }
}
public class Main {
    public static void main(String[] args) {
        Data<Integer> data = new Data<Integer>(4);
        System.out.println(data.compareTo(3));
    }
}