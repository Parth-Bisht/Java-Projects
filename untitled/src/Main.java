import java.util.ArrayList;

class intWrapper{
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> studentNumbers = new ArrayList<>();
//        studentNumbers.add(25); //autoBoxing
//        System.out.println(studentNumbers.get(0)); //unboxing

        ArrayList<intWrapper> studentNumbers = new ArrayList<>();
        studentNumbers.add(new intWrapper(25)); //boxing
        System.out.println(studentNumbers.get(0).getIntValue()); //unboxing


        ArrayList<Double> demoList = new ArrayList<>();
//        demoList.add(25.5);
        demoList.add(Double.valueOf(25.4)); //background it is happning while autoboxing
        System.out.println(demoList.get(0).doubleValue()); //this is done while unboxing
    }
}