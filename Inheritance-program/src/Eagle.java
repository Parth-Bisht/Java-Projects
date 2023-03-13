public class Eagle extends Bird{
    public Eagle(){
        weightInKilos = 1;
    }
    public String ShowInfo() {
        return "Eagle{" +
                "feather=" + feather +
                ", canFly=" + canFly +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
