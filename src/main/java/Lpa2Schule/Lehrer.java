package Lpa2Schule;

public class Lehrer extends Mitarbeiter {

    Klasse klasse;
    private int wochenstunden;

    public Lehrer(String vorname, String nachname, int wochenstunden, Klasse klasse) {
        super(vorname, nachname);
        this.wochenstunden = wochenstunden;
        this.klasse = klasse;
    }

    public Lehrer(String vorname, String nachname, double gehalt, int wochenstunden, Klasse klasse) {
        super(vorname, nachname, gehalt);
        this.wochenstunden = wochenstunden;
        this.klasse = klasse;
    }

    public Lehrer(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Lehrer(String vorname, String nachname, int wochenstunden) {
        super(vorname, nachname);
        this.wochenstunden = wochenstunden;
    }

    public Lehrer(String vorname, String nachname, double gehalt, int wochenstunden) {
        super(vorname, nachname, gehalt);
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
        return 14 * gehalt;
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public int getWochenstunden() {
        return wochenstunden;
    }

    public void setWochenstunden(int wochenstunden) {
        this.wochenstunden = wochenstunden;
    }

    @Override
    public String toString() {
        return String.format("Lehrer %s %s (Klasse %s), %d Tage Urlaub, %5.2f Jahresgehalt",
                vorname, nachname, getKlasse().getBezeichnung(), getUrlaubsanspruch(), getJahresgehalt());
    }
}
