package Lpa2Schule;

import java.util.ArrayList;
import java.util.List;

public class Note {

    Topics topics;
    List<Schueler> schuelerList = new ArrayList<>();
    private int note;

    public Note(Topics topics, int note, List<Schueler> schuelerList) {
        this.topics = topics;
        this.note = note;
        this.schuelerList = schuelerList;
    }

    public Note(int note, Topics topics) {
        this.note = note;
        this.topics = topics;
    }

    public List<Schueler> getSchuelerList() {
        return schuelerList;
    }

    public void setSchuelerList(List<Schueler> schuelerList) {
        this.schuelerList = schuelerList;
    }

    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "topics=" + topics +
                ", schuelerList=" + schuelerList +
                ", note=" + note +
                '}';
    }
}
