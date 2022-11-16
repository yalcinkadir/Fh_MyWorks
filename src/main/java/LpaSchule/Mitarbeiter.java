package LpaSchule;

abstract class Mitarbeiter extends PersonLpa {
    protected double gehalt;

    public Mitarbeiter(String vorname, String nachname, double gehalt) {
        super(vorname, nachname);
        this.gehalt = gehalt;
    }

    abstract int getUrlaubsanspruch();

    abstract double getJahresgehalt();

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return String.format(", %d Tage Urlaub, %2.1f Jahresgehalt",
                getUrlaubsanspruch(), getJahresgehalt());
    }
}
