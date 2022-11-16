package assignment6;

public class Bat extends Mammal {
    int batSize;
    boolean batHumanPest;

    public Bat(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, int batSize, boolean batHumanPest) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest);
        this.batSize = batSize;
        this.batHumanPest = batHumanPest;
    }

    public int getBatSize() {
        return batSize;
    }

    public void setBatSize(int batSize) {
        this.batSize = batSize;
    }

    public boolean isBatHumanPest() {
        return batHumanPest;
    }

    public void setBatHumanPest(boolean batHumanPest) {
        this.batHumanPest = batHumanPest;
    }


}
