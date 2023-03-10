public class IfElse {
    public static void main(String[] args){
        int x = 6;
        if(x==6){
            System.out.println("Value of x is 6");
        }else{
            System.out.println("Value of x is not 6");
        }

        int a = 12;
        if(a<12){
            System.out.println("Value is less than 12");
        } else if (a == 12) {
            System.out.println("Value is equal to 12");
        } else{
            System.out.println("Value is grater than 12");
        }

        boolean u = true, v= false;
        if(u&&v){
            System.out.println("add condition compiled");
        }else if(u || v){
            System.out.println("or condition compiled");
        }
    }
}
