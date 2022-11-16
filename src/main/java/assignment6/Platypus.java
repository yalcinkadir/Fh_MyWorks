package assignment6;

public class Platypus extends Mammal {
    int platypusSize;
    String platypusColor;

    public Platypus(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, int platypusSize, String platypusColor) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest);
        this.platypusSize = platypusSize;
        this.platypusColor = platypusColor;
    }

    public int getPlatypusSize() {
        return platypusSize;
    }

    public void setPlatypusSize(int platypusSize) {
        this.platypusSize = platypusSize;
    }

    public String getPlatypusColor() {
        return platypusColor;
    }

    public void setPlatypusColor(String platypusColor) {
        this.platypusColor = platypusColor;
    }
}
