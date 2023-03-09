public class Strings {
    public static void main(String[] args){
//        String var = "Hello World \u00bb";
//        String var1 = "10";
        int var1 = 10;
        String var2 = "20";
        System.out.println(var1+var2+"hi"); //give same output because of typecasting
        // typecasting is changing one variable to another data type
        // if anything rather than string is there it would be converted into string data type

        String message = new String("Hello World");
        System.out.println(message);
    }
}
