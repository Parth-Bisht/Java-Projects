public class TypeCasting {
    public static void main(Strings[] args){
        short y = 10;
        int x = y;
        System.out.println(x); //this is implicit typecasting


        int a = 12;
        short b = (short)a;
        System.out.println(b); //explicit type casting

        double v2 = 20.023421312323d;
        float v1 = (float) v2;
        System.out.println(v1); //lose some data

        String c = "10";
        int d = (int)c; //give error

        float e = 10.0f;
        int f = int(e);
    }
}
