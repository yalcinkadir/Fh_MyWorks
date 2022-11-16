package assignment6;

public class Owl extends Bird {
    int owlSize;
    String owlColor;

    public Owl(int animalFootCount, String animalBreeds, int birdSize, boolean birdDomestic, int owlSize, String owlColor) {
        super(animalFootCount, animalBreeds, birdSize, birdDomestic);
        this.owlSize = owlSize;
        this.owlColor = owlColor;
    }

    public int getOwlSize() {
        return owlSize;
    }

    public void setOwlSize(int owlSize) {
        this.owlSize = owlSize;
    }

    public String getOwlColor() {
        return owlColor;
    }

    public void setOwlColor(String owlColor) {
        this.owlColor = owlColor;
    }
}
