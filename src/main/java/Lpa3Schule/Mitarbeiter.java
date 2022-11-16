package Lpa3Schule;

abstract class Mitarbeiter extends Person{
    protected double gehalt;

    abstract int getUrlaubsanspruch();
    abstract double getJahresgehalt();
}
