package LpaSchule;

import java.util.List;

public class Schueler extends PersonLpa {

    Klasse klasse;
    List<Note> notes;

    public Schueler(String vorname, String nachname, Klasse klasse, List<Note> notes) {
        this(vorname, nachname, klasse);
        this.notes = notes;
    }

    public Schueler(String vorname, String nachname, Klasse klasse) {
        super(vorname, nachname);
        this.klasse = klasse;
        this.klasse.getSchuelerList().add(this);
    }

    public double getNotendurchschnitt() {
        int totalNotes = 0;
        for (Note n : notes) {
            totalNotes += n.getNote();
        }
        return totalNotes / notes.size();
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s %s (Klasse %s), %d Noten, Notenschnitt: %1.1f",
                vorname, nachname, klasse.getBezeichnung(), notes.size(), getNotendurchschnitt());
    }
}