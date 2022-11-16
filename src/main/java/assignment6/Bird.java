package assignment6;

public class Bird extends Animal {
    int birdSize;
    boolean birdDomestic;

    public Bird(int animalFootCount, String animalBreeds, int birdSize, boolean birdDomestic) {
        super(animalFootCount, animalBreeds);
        this.birdSize = birdSize;
        this.birdDomestic = birdDomestic;
    }

    public int getBirdSize() {
        return birdSize;
    }

    public void setBirdSize(int birdSize) {
        this.birdSize = birdSize;
    }

    public boolean isBirdDomestic() {
        return birdDomestic;
    }

    public void setBirdDomestic(boolean birdDomestic) {
        this.birdDomestic = birdDomestic;
    }
}
