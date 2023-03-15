package org.parth;

public class App {
    public static void main(String[] args){
        App obj = new App();
//        obj.case1(10,0);
//        obj.case2(5,0);
        obj.case3(3);
    }

    public void case1(int x, int y){
        if(y!=0){
            System.out.println(x/y);
        }else{
            System.out.println("The value of y is 0");
        }

    }
    public void case2(int x, int y){
        try {
            System.out.println(x / y);
        }
        catch(ArithmeticException e){ // according to the heirarcy of exceptions
            System.out.println("ArithmeticException");
        }
        catch(Exception e){
//            System.out.println(e);
            e.printStackTrace();
            System.out.println("The value is 0");
        }
    }

    public void case3(int x){
        try{
            System.out.println("console"+x/0);
        }
        catch(RuntimeException e){
            System.out.println("Runtime Exception");
        }
        catch(Exception e){
            System.out.println("Exception!!");
        }
        finally {
            System.out.println("This will get print everytime");
            System.out.println();
        }
    }
}
