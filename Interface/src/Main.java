public class Main {
    public static void main(String[ ] args) {
//       OnePlus5 phone = new OnePlus5();
//       String processor = phone.processor();
//       System.out.println(processor);
        Phone phone = new Iphone8();
        System.out.println("Processor: "+phone.processor());
        System.out.println("Space in GB: "+phone.spaceInGB());
        System.out.println("OS: "+phone.OS());
    }
}