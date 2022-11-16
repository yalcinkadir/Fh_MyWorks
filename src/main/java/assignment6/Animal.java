package assignment6;

public class Animal {
    int animalFootCount;
    String animalBreeds;

    public Animal(int animalFootCount, String animalBreeds) {
        this.animalFootCount = animalFootCount;
        this.animalBreeds = animalBreeds;
    }

    public int getAnimalFootCount() {
        return animalFootCount;
    }

    public void setAnimalFootCount(int animalFootCount) {
        this.animalFootCount = animalFootCount;
    }

    public String getAnimalBreeds() {
        return animalBreeds;
    }

    public void setAnimalBreeds(String animalBreeds) {
        this.animalBreeds = animalBreeds;
    }
}
