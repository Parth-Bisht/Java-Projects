import java.util.ArrayList;
import java.util.List;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
//        final int x = 10;
//        new Thread(()-> System.out.println("This value of x: "+x)).start();

//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(50);
//        list.add(50);
//        list.add(58);
//        list.add(584);

//        for(Integer i: list){
//            if(i>=10) System.out.println(i);
//        }

//        list.forEach(i -> {
//            if(i>=10) System.out.println(i);
//        });

        List<Data> list = new ArrayList<>();
        list.add(new Data("Name"));
        list.add(new Data("ppp"));
        list.add(new Data("jkjk"));
        list.add(new Data("wiueoi"));
        list.add(new Data("sadjfjkv"));

        list.forEach(temp->{
            System.out.println(temp.getName());
        });
    }
}