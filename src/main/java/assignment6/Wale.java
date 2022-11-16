package assignment6;

public class Wale extends Mammal {
    int waleSize;
    String waleColor;

    public Wale(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, int waleSize, String waleColor) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest);
        this.waleSize = waleSize;
        this.waleColor = waleColor;
    }

    public int getWaleSize() {
        return waleSize;
    }

    public void setWaleSize(int waleSize) {
        this.waleSize = waleSize;
    }

    public String getWaleColor() {
        return waleColor;
    }

    public void setWaleColor(String waleColor) {
        this.waleColor = waleColor;
    }
}
