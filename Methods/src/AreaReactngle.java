public class AreaReactngle {
    public static void main(String[] args){
//        areaRectangle(12,22);
        double area = areaRectangle(12,22);
        System.out.println(area);

        System.out.println(area(14.25d,10.65d));
        System.out.println(area(5d));
        System.out.println(area(5));

        System.out.println(sum(2,4.5f));
    }
    /*
    public static void areaRectangle(double length, double width){
        System.out.println(length*width);  //console the value
    }
     */
    public static double areaRectangle(double length, double width){
        return length*width;
    }

    public static double area(double length, double width){
        return length*width;
    }

    public static double area(double side){
        return side*side;
    }

    public static int area(int side){
        return side*side;
    }

    public static float sum(int x, float y){
        System.out.println(("Adding int and float entity"));
        return x+y;
    }
}
