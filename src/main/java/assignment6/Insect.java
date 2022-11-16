package assignment6;

public class Insect extends Animal {

    String locomotion;          //Flight, Walking, Swimming
    boolean humanPest;

    public Insect(int animalFootCount, String animalBreeds, String locomotion, boolean humanPest) {
        super(animalFootCount, animalBreeds);
        this.locomotion = locomotion;
        this.humanPest = humanPest;
    }

    public String getLocomotion() {
        return locomotion;
    }

    public void setLocomotion(String locomotion) {
        this.locomotion = locomotion;
    }

    public boolean isHumanPest() {
        return humanPest;
    }

    public void setHumanPest(boolean humanPest) {
        this.humanPest = humanPest;
    }
}
