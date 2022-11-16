package assignment6;

public class Kangaroo extends Mammal {
    int kangorooSize;
    String kangorooColor;

    public Kangaroo(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, int kangorooSize, String kangorooColor) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest);
        this.kangorooSize = kangorooSize;
        this.kangorooColor = kangorooColor;
    }

    public int getKangorooSize() {
        return kangorooSize;
    }

    public void setKangorooSize(int kangorooSize) {
        this.kangorooSize = kangorooSize;
    }

    public String getKangorooColor() {
        return kangorooColor;
    }

    public void setKangorooColor(String kangorooColor) {
        this.kangorooColor = kangorooColor;
    }
}
