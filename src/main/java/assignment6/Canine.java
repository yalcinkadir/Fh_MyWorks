package assignment6;

public class Canine extends Mammal {
    boolean canineWild;
    int canineSize;

    public Canine(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, boolean canineWild, int canineSize) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest);
        this.canineWild = canineWild;
        this.canineSize = canineSize;
    }

    public boolean isCanineWild() {
        return canineWild;
    }

    public void setCanineWild(boolean canineWild) {
        this.canineWild = canineWild;
    }

    public int getCanineSize() {
        return canineSize;
    }

    public void setCanineSize(int canineSize) {
        this.canineSize = canineSize;
    }
}
