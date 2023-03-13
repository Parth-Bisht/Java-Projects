public class Main {
    public static void main(String[] args) {
//        Laptop lappy = new Laptop();
//        System.out.println(lappy.getProcessor().getBrand());
        Processor processor = new Processor("intel","i5 7200u",7,4,4,"6MB","6.5Ghz","2.5Ghz","6.5Ghz");
        GraphicsCard graphicsCard = new GraphicsCard("Nevdia",940,"2GB");
        Laptop gamingLaptop = new Laptop(17f,processor,"DDR4","4TB",graphicsCard,"MLT Layer","mechanical");
        System.out.println(gamingLaptop);

        gamingLaptop.gamingMode();
        System.out.println(gamingLaptop.getProcessor().getFrequency());
    }
}