package assignment6;

public class Feline extends Lion {
    boolean felineDomestic;
    String felineColor;

    public Feline(int animalFootCount, String animalBreeds, int mammalFootCount, boolean mammalHumanPest, int lionSize, String lionBreeds, boolean felineDomestic, String felineColor) {
        super(animalFootCount, animalBreeds, mammalFootCount, mammalHumanPest, lionSize, lionBreeds);
        this.felineDomestic = felineDomestic;
        this.felineColor = felineColor;
    }

    public boolean isFelineDomestic() {
        return felineDomestic;
    }

    public void setFelineDomestic(boolean felineDomestic) {
        this.felineDomestic = felineDomestic;
    }

    public String getFelineColor() {
        return felineColor;
    }

    public void setFelineColor(String felineColor) {
        this.felineColor = felineColor;
    }
}
