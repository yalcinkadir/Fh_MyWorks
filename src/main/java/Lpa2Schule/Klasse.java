package Lpa2Schule;

import java.util.ArrayList;
import java.util.List;

public class Klasse {

    List<Lehrer> lehrerList = new ArrayList<>();
    List<Schueler> schuelerList = new ArrayList<>();
    private String bezeichnung;


    public Klasse(List<Lehrer> lehrerList, List<Schueler> schuelerList, String bezeichnung) {
        this.lehrerList = lehrerList;
        this.schuelerList = schuelerList;
        this.bezeichnung = bezeichnung;
    }

    public Klasse(String bezeichnung, List<Lehrer> lehrerList) {
        this.bezeichnung = bezeichnung;
        this.lehrerList = lehrerList;
    }

    public Klasse(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public List<Schueler> getSchuelerList() {
        return schuelerList;
    }

    public void setSchuelerList(List<Schueler> schuelerList) {
        this.schuelerList = schuelerList;
    }

    public List<Lehrer> getLehrerList() {
        return lehrerList;
    }

    public void setLehrerList(List<Lehrer> lehrerList) {
        this.lehrerList = lehrerList;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "Klasse{" +
                "lehrerList=" + lehrerList +
                ", schuelerList=" + schuelerList +
                ", bezeichnung='" + bezeichnung + '\'' +
                '}';
    }
}
