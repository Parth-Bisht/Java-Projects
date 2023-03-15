public class Main {
//    public static final int COREJAVA = 1;
//    public static final int COLLECTIONS = 2;
//    public static final int GENERICS = 3;
//    public static final int JSPANDSERVLETS = 4;
//    public static final int MULTITHREADING = 5;
    public static void main(String[] args) {
//        int learning = 3;
//        switch (learning){
//            case COLLECTIONS: System.out.println("Step 2: Learning Collections framework");
//                    break;
//            case COREJAVA: System.out.println("Step 1: Learning Core Java");
//                    break;
//            case JSPANDSERVLETS: System.out.println("Step 4: Learning JSP and Servlets");
//                    break;
//            case GENERICS: System.out.println("Step 3: Learning GENERICS");
//                    break;
//            case MULTITHREADING: System.out.println("Step 5: Learning MULTITHREADING");
//                    break;
//        }
        Learning learn = Learning.MULTITHREADING;
        switch(learn){
            case COREJAVA -> {
                System.out.println("Step 1: Learning Core Java");
            }
            case COLLECTIONS -> {
                System.out.println("Step 2: Learning Collections framework");
            }
            case GENERICS -> {
                System.out.println("Step 3: Learning GENERICS");
            }
            case JSPANDSERVLETS -> {
                System.out.println("Step 4: Learning JSP and Servlets");
            }
            case MULTITHREADING -> {
                System.out.println("Step 5: Learning MULTITHREADING");
            }
            default -> {
                System.out.println("Element not in enum list");
            }
        }
    }
}