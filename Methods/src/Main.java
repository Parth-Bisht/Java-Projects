public class Main {
    public static void main(String[] args) {
        loop1();
        System.out.println("***************");
        loop2();
        System.out.println("***************");
        loop(1,20);
    }

    public static void loop1(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void loop2(){
        int j = 10;
        while (j>=0){
            System.out.println(j);
            j--;
        }
    }

    public static void loop(int step,int finalValue){
        while(step<=finalValue){
            System.out.println(step);
            step++;
        }
    }
}