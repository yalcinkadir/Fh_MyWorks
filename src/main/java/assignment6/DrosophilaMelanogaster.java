package assignment6;

public class DrosophilaMelanogaster extends Insect {
    int drosophilaMelanogasterSize;
    int drosophilaMelanogasterFootCount;

    public DrosophilaMelanogaster(int footCount, String breeds, String locomotion, boolean humanPest, int drosophilaMelanogasterSize, int drosophilaMelanogasterFootCount) {
        super(footCount, breeds, locomotion, humanPest);
        this.drosophilaMelanogasterSize = drosophilaMelanogasterSize;
        this.drosophilaMelanogasterFootCount = drosophilaMelanogasterFootCount;
    }

    public int getDrosophilaMelanogasterSize() {
        return drosophilaMelanogasterSize;
    }

    public void setDrosophilaMelanogasterSize(int drosophilaMelanogasterSize) {
        this.drosophilaMelanogasterSize = drosophilaMelanogasterSize;
    }

    public int getDrosophilaMelanogasterFootCount() {
        return drosophilaMelanogasterFootCount;
    }

    public void setDrosophilaMelanogasterFootCount(int drosophilaMelanogasterFootCount) {
        this.drosophilaMelanogasterFootCount = drosophilaMelanogasterFootCount;
    }
}
