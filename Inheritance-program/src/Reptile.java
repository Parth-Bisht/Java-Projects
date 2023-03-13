public class Reptile extends Animal{
    protected String skin,egg;
    protected boolean backbone;

    public Reptile(){
        heightInFeet= 5;
        weightInKilos = 30;
        animalType = "reptile";
        bloodType = "cold";
        this.skin = "Dry Skin";
        this.backbone = true;
        this.egg = "soft shelled";
    }

    public String ShowInfo() {
        return "Reptile{" +
                "skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                ", heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
