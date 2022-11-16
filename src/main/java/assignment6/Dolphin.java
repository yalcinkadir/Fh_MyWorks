package assignment6;

public class Dolphin extends Wale {
    String dolphinColor;
    int dolphinSize;

    public Dolphin(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, int waleSize, String waleColor, String dolphinColor, int dolphinSize) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest, waleSize, waleColor);
        this.dolphinColor = dolphinColor;
        this.dolphinSize = dolphinSize;
    }

    public String getDolphinColor() {
        return dolphinColor;
    }

    public void setDolphinColor(String dolphinColor) {
        this.dolphinColor = dolphinColor;
    }

    public int getDolphinSize() {
        return dolphinSize;
    }

    public void setDolphinSize(int dolphinSize) {
        this.dolphinSize = dolphinSize;
    }
}
