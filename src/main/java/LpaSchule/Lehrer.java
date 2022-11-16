package LpaSchule;

public class Lehrer extends Mitarbeiter {
    Klasse klasse;
    private int wochenstunden;

    public Lehrer(String vorname, String nachname, double gehalt, int wochenstunden, Klasse klasse) {
        super(vorname, nachname, gehalt);
        this.wochenstunden = wochenstunden;
        this.klasse = klasse;
    }

    public Lehrer(String vorname, String nachname, double gehalt) {
        super(vorname, nachname, gehalt);
    }

    public int getWochenstunden() {
        return wochenstunden;
    }

    public void setWochenstunden(int wochenstunden) {
        this.wochenstunden = wochenstunden;
    }


    @Override
    int getUrlaubsanspruch() {
        if (wochenstunden < 10) {
            return 30;
        } else if (wochenstunden >= 10) {
            return 50;
        } else if (wochenstunden >= 16) {
            return 60;
        } else if (wochenstunden >= 22) {
            return 70;
        } else {
            return 0;
        }
    }

    @Override
    double getJahresgehalt() {
        return 14 * getGehalt();
    }

    @Override
    public String toString() {
        return String.format("Lehrer %s %s (Klasse %s)", vorname, nachname, getKlasse().getBezeichnung()) + super.toString();
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }
}
