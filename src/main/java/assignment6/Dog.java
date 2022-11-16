package assignment6;

public class Dog extends Canine {
    String dogBreeds;
    int dogSize;

    public Dog(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, boolean canineWild, int canineSize, String dogBreeds, int dogSize) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest, canineWild, canineSize);
        this.dogBreeds = dogBreeds;
        this.dogSize = dogSize;
    }

    public String getDogBreeds() {
        return dogBreeds;
    }

    public void setDogBreeds(String dogBreeds) {
        this.dogBreeds = dogBreeds;
    }

    public int getDogSize() {
        return dogSize;
    }

    public void setDogSize(int dogSize) {
        this.dogSize = dogSize;
    }
}
