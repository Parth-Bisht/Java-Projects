public class Eel extends Fish{
    private String special;

    public Eel(){
        this.special = "releases electric shock";
    }

    public String ShowInfo() {
        return "Eel{" +
                "special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
