package assignment6;

public class Ant extends Insect {
    boolean antHumanPest;
    int antSize;

    public Ant(int footCount, String breeds, String locomotion, boolean humanPest, boolean antHumanPest, int antSize) {
        super(footCount, breeds, locomotion, humanPest);
        this.antHumanPest = antHumanPest;
        this.antSize = antSize;
    }

    public boolean isAntHumanPest() {
        return antHumanPest;
    }

    public void setAntHumanPest(boolean antHumanPest) {
        this.antHumanPest = antHumanPest;
    }

    public int getAntSize() {
        return antSize;
    }

    public void setAntSize(int antSize) {
        this.antSize = antSize;
    }
}
