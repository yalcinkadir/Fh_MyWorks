package assignment6;

public class Wolf extends Canine {
    String wolfColor;
    int wolfSize;

    public Wolf(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, boolean canineWild, int canineSize, String wolfColor, int wolfSize) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest, canineWild, canineSize);
        this.wolfColor = wolfColor;
        this.wolfSize = wolfSize;
    }

    public String getWolfColor() {
        return wolfColor;
    }

    public void setWolfColor(String wolfColor) {
        this.wolfColor = wolfColor;
    }

    public int getWolfSize() {
        return wolfSize;
    }

    public void setWolfSize(int wolfSize) {
        this.wolfSize = wolfSize;
    }
}
