package assignment6;

public class Lion extends Mammal {
    int lionSize;
    String lionBreeds;

    public Lion(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, int lionSize, String lionBreeds) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest);
        this.lionSize = lionSize;
        this.lionBreeds = lionBreeds;
    }

    public int getLionSize() {
        return lionSize;
    }

    public void setLionSize(int lionSize) {
        this.lionSize = lionSize;
    }

    public String getLionBreeds() {
        return lionBreeds;
    }

    public void setLionBreeds(String lionBreeds) {
        this.lionBreeds = lionBreeds;
    }
}
