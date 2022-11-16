package LpaSchule;

import java.util.*;

public class MainLpaSchule {

    private static final List<Schueler> schuelerList = new ArrayList<>();
    private static final List<Mitarbeiter> mitarbeiterList = new ArrayList<>();
    private static final List<Klasse> klasseList = new ArrayList<>();

    public static void main(String[] args) {
        initDemoData();
        printSchueler();
        printMitarbeiter(mitarbeiterList);
        printKlassen(klasseList);
        getBestSchueler();


    }

    public static void printKlassen(Collection<Klasse> klasseCollections) {
        for (Klasse klasse : klasseCollections) {
            printKlasse(klasse);
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
        System.out.println(schueler);
        return schueler;
    }

    public static void printSchueler() {
        for (Schueler s : schuelerList) {
            System.out.println(s);
        }
    }

    public static void printMitarbeiter(Collection<Mitarbeiter> mitarbeiterCollection) {
        for (Mitarbeiter mitarbeiter : mitarbeiterCollection) {
            printMitarbeiter(mitarbeiter);
        }
    }

    public static void printMitarbeiter(Mitarbeiter mitarbeiter) {
        System.out.println(mitarbeiter);
    }

    public static void initDemoData() {

        Lehrer lehrer = new Lehrer("v", "n", 3000);
        Klasse klasse1 = new Klasse("K1", lehrer);
        Klasse klasse2 = new Klasse("K2", lehrer);

        schuelerList.add(new Schueler("VornameA1", "NachnameA1", klasse1, Arrays.asList(
                new Note("Deusch", 9),
                new Note("Englisch", 5),
                new Note("Mathe", 1)
        )));
        schuelerList.add(new Schueler("VornameA2", "NachnameA2", klasse1, Arrays.asList(
                new Note("Deusch", 2),
                new Note("Englisch", 5),
                new Note("Mathe", 7)
        )));
        mitarbeiterList.add(lehrer);
        mitarbeiterList.add(new Hilfskraft("HilfskraftV1", "HilfskraftN1", 2000));
        klasseList.add(klasse1);
        klasseList.add(klasse2);
    }

}
