package Lpa2Schule;

public class Hilfskraft extends Mitarbeiter {

    public Hilfskraft(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Hilfskraft(String vorname, String nachname, double gehalt) {
        super(vorname, nachname, gehalt);
    }

    @Override
    int getUrlaubsanspruch() {
        return 25;
    }

    @Override
    double getJahresgehalt() {
        return 12 * gehalt;
    }

    @Override
    public String toString() {
        return String.format("Hilfskraft %s %s, %d Tage Urlaub, %5.2f Jahresgehalt",
                vorname, nachname, getUrlaubsanspruch(), getJahresgehalt());
    }
}
