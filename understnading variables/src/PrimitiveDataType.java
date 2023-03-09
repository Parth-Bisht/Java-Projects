import java.math.BigDecimal;

public class PrimitiveDataType {
    public static void main(String[] args){
        int max = 2147483647; //max value for int data type
        int min = -2147483648; //min value for int data type

        short shortMax = 32767; //max value for short data type
        short shortMin = -32768; //min value for short data type

        long longMax = 9223372036854775807L; //use L in the end to make it long data type
        long longMin = -9223372036854775808L;

         byte byteMax = 127;
         byte byteMin = -128;

         float value2 = 9; //show 9.0 in the console, 32bit memory taken
        double value3 = 9; //64bit memory

        int marker = 512;
        double percentage  = marker * 0.46f;


//        System.out.println("Percentage:"+percentage);


//        boolean var = false;
//        System.out.println(var);


        //Big Decimal
        double x = 1.42;
        double y = 2.55;
        System.out.println(x+y);
        BigDecimal d1 = new BigDecimal("1.05");
        BigDecimal d2 = new BigDecimal("2.55");
        System.out.println(d1.add(d2));

    }
}
