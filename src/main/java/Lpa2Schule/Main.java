package Lpa2Schule;

import java.util.*;

import static Lpa2Schule.Topics.*;

public class Main {

    private static final List<Schueler> schuelerList = new ArrayList<>();
    private static final List<Mitarbeiter> mitarbeiterList = new ArrayList<>();
    private static final List<Klasse> klasseList = new ArrayList<>();

    public static void main(String[] args) {
        initDemoData();
        printMitarbeiter(mitarbeiterList);
        printSchueler();
        getBestSchueler();

    }

    public static void printKlassen(Collection<Klasse> klasseCollection) {
        for (Klasse klasse : klasseCollection) {
            System.out.println(klasse);
        }
    }

    public static void printKlasse(Klasse klasse) {
        System.out.println(klasse);
    }

    public static Schueler getBestSchueler() {
        Schueler schueler = schuelerList
                .stream()
                .min(Comparator.comparing(Schueler::getNotendurchschnitt))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Best Schüler: " + schueler);
        return null;

    }

    public static void printSchueler() {
        for (Schueler s : schuelerList) {
            System.out.println(s);
        }
    }

    public static void printMitarbeiter(Collection<Mitarbeiter> mitarbeiterCollection) {
        for (Mitarbeiter m : mitarbeiterCollection) {
            System.out.println(m);
        }
    }

    public static void printMitarbeiter(Mitarbeiter mitarbeiter) {

    }

    public static void initDemoData() {
        Klasse k1 = new Klasse("K1");
        Klasse k2 = new Klasse("K2");
        Klasse k3 = new Klasse("K3");

        schuelerList.add(new Schueler("VornameS1", "NachnameS1", k1, Arrays.asList(new Note(2, DEUTSCH), new Note(3, ENGLISCH))));
        schuelerList.add(new Schueler("VornameS2", "NachnameS2", k1, Arrays.asList(new Note(2, DEUTSCH), new Note(1, ENGLISCH))));
        schuelerList.add(new Schueler("VornameS3", "NachnameS3", k2, Arrays.asList(new Note(2, ENGLISCH), new Note(3, MATHEMATIK))));
        schuelerList.add(new Schueler("VornameS4", "NachnameS4", k2, Arrays.asList(new Note(1, MATHEMATIK), new Note(2, DEUTSCH))));

        mitarbeiterList.add(new Lehrer("LV1", "LN1", 3000.0, 15, k1));
        mitarbeiterList.add(new Lehrer("LV2", "LN2", 4000.0, 20, k2));
        mitarbeiterList.add(new Lehrer("LV3", "LN3", 2000.0, 10, k3));
        mitarbeiterList.add(new Hilfskraft("HV1", "HN1", 2500));
        mitarbeiterList.add(new Hilfskraft("HV2", "HN2", 3000));

    }

}
