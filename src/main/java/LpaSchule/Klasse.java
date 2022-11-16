package LpaSchule;

import java.util.ArrayList;
import java.util.List;

public class Klasse {
    List<Schueler> schuelerList = new ArrayList<>();
    private String bezeichnung;
    private Lehrer lehrer;

    public Klasse(String bezeichnung, Lehrer lehrer) {
        this.bezeichnung = bezeichnung;
        this.lehrer = lehrer;
        this.lehrer.setKlasse(this);
    }

    public Klasse(String bezeichnung, List<Schueler> schuelerList) {
        this.bezeichnung = bezeichnung;
        this.schuelerList = schuelerList;
    }

    public List<Schueler> getSchuelerList() {
        return schuelerList;
    }

    public void setSchuelerList(List<Schueler> schuelerList) {
        this.schuelerList = schuelerList;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Lehrer getLehrer() {
        return lehrer;
    }

    public void setLehrer(Lehrer lehrer) {
        this.lehrer = lehrer;
    }

    @Override
    public String toString() {
        return String.format("%s (%s %s): %d", bezeichnung, getLehrer().vorname, getLehrer().nachname, schuelerList.size());
    }
}
