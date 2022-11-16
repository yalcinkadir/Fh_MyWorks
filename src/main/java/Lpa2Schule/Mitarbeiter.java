package Lpa2Schule;

abstract class Mitarbeiter extends Person {

    protected double gehalt;

    public Mitarbeiter(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Mitarbeiter(String vorname, String nachname, double gehalt) {
        super(vorname, nachname);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    abstract int getUrlaubsanspruch();

    abstract double getJahresgehalt();

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "gehalt=" + gehalt +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
