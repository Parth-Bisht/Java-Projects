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

        int q = 12;
        int w = 19;
        if((q<w)&& (q==w)){
            System.out.println("Hello");
        }else{
            System.out.println("No");
        }


        int ageOfBoy = 21;
        int ageOfGirl = 18;

        if(ageOfBoy>=21 && ageOfGirl>=18){
            System.out.println("ready to get married");
        }else{
            System.out.println("Wait for it kiddo");
        }
    }
}
