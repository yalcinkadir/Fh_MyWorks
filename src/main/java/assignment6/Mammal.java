package assignment6;

public class Mammal extends Animal {
    int mammalFootCount;
    boolean mammalHumanPest;

    public Mammal(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest) {
        super(animalFootCount, animalBreeds);
        this.mammalFootCount = mammalFootCount;
        this.mammalHumanPest = mammalHumanPest;
    }

    public int getMammalFootCount() {
        return mammalFootCount;
    }

    public void setMammalFootCount(int mammalFootCount) {
        this.mammalFootCount = mammalFootCount;
    }

    public boolean isMammalHumanPest() {
        return mammalHumanPest;
    }

    public void setMammalHumanPest(boolean mammalHumanPest) {
        this.mammalHumanPest = mammalHumanPest;
    }
}
