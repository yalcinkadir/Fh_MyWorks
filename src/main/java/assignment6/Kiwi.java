package assignment6;

public class Kiwi extends Bird {
    int kiwiSize;
    String kiwiColor;

    public Kiwi(int animalFootCount, String animalBreeds, int birdSize, boolean birdDomestic, int kiwiSize, String kiwiColor) {
        super(animalFootCount, animalBreeds, birdSize, birdDomestic);
        this.kiwiSize = kiwiSize;
        this.kiwiColor = kiwiColor;
    }

    public int getKiwiSize() {
        return kiwiSize;
    }

    public void setKiwiSize(int kiwiSize) {
        this.kiwiSize = kiwiSize;
    }

    public String getKiwiColor() {
        return kiwiColor;
    }

    public void setKiwiColor(String kiwiColor) {
        this.kiwiColor = kiwiColor;
    }
}
