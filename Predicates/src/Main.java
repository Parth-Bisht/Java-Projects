import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
//        IntPredicate lessthan18 = new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                if(value<18) return true;
//                else return false;
//            }
//        };

        IntPredicate lessThan18 = i -> i<18;
        IntPredicate moreThan10 = i -> i>10;
//        System.out.println(lessthan18.and(morethan10).test(20));

        new Main().demo(11,lessThan18,moreThan10);
    }

    public void demo(int x,IntPredicate lessThan18, IntPredicate moreThan10){
        if(lessThan18.and(moreThan10).test(x)){
            System.out.println("The input is less than18 and more than 10");
        }else{
            System.out.println("Invalid input");
        }
    }
}