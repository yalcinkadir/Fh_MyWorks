package LpaSchule;

public class Note {
    private String fach;
    private int note;

    public Note(String fach, int note) {
        this.fach = fach;
        this.note = note;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
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
                "fach='" + fach + '\'' +
                ", note=" + note +
                '}';
    }
}
