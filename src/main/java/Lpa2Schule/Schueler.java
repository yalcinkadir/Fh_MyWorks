package Lpa2Schule;

import java.util.ArrayList;
import java.util.List;

public class Schueler extends Person {


    Klasse klasse;
    List<Note> noteList = new ArrayList<>();

    public Schueler(String vorname, String nachname, Klasse klasse, List<Note> noteList) {
        super(vorname, nachname);
        this.klasse = klasse;
        this.noteList = noteList;
    }

    public Schueler(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public List<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Note> noteList) {
        this.noteList = noteList;
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public double getNotendurchschnitt() {
        int avarageNote = 0;
        for (Note n : noteList) {
            avarageNote += n.getNote();
        }
        return avarageNote / noteList.size();
    }

    @Override
    public String toString() {
        return String.format("%s %s (Klasse %s), %d Noten, Notendurchschnitt %1.1f",
                vorname, nachname, klasse.getBezeichnung(), noteList.size(), getNotendurchschnitt());
    }
}
