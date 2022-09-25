package fh.examples;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        // BereichII
        readerBereich2();
        // Volljährigkeit
        readerVolljaehrigkeit();
        // Registrierung
        readerRegistrierung();
        // MIN, MAX
        readerMinMax();
        // Schaltjahr
        readerSchaltjahr();
    }

    // Übung1 BereichII
    public static boolean isImBereich(double zahl) {
        return zahl >= 1500 && zahl <= 3500 || zahl >= 7500 && zahl <= 10000;
    }

    public static void readerBereich2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Übung1 BereichII\nGeben Sie eine Zahl zwischen 0 - 10000 ein: ");
        int eingabe = scanner.nextInt();
        boolean b = isImBereich(eingabe);
        System.out.printf("%d im Bereich? : %b\n", eingabe, b);
        System.out.println("Ich gebe dir noch eine Chance eine Zahl einzugeben.");
    }

    // Übung2 Volljährigkeit
    public static boolean isVolljaehrig(int alter) {
        return alter >= 18;
    }

    public static void readerVolljaehrigkeit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nÜbung2 Volljährigkeit\nGeben Sie ihr Alter ein: ");
        int eingabe = scanner.nextInt();
        boolean b = isVolljaehrig(eingabe);
        System.out.printf("%d volljährig? : %b\n", eingabe, b);
        System.out.println("Ich gebe dir noch eine Chance eine Zahl einzugeben.");
    }

    // Übung3 Registrierung
    public static void readerRegistrierung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nÜbung3 Registrierung\nVorname: ");
        String eingabeVorname = scanner.nextLine();
        System.out.println("Nachname: ");
        String eingabeNachname = scanner.nextLine();
        System.out.println("Alter: ");
        int eingabeAlter = scanner.nextInt();
        if (eingabeAlter >= 21) {
            System.out.println("Danke für deine Registrierung. \nMöchstest du deine Daten ansehen? J/N");
            String eingabeAntwort = scanner.next();
            if (eingabeAntwort.equals("j") || eingabeAntwort.equals("J")) {
                System.out.printf("%s %s,%d\n", eingabeVorname.toUpperCase(), eingabeNachname.toUpperCase(), eingabeAlter);
            } else if (eingabeAntwort.equals("n") || eingabeAntwort.equals("N")) {
                System.out.println("Danke für deine Registrierung. Bis Bald!");
            }
        } else {
            System.out.println("Leider bist du nicht alt genug!");
        }
    }

    // Übung4 MIN, MAX
    public static void readerMinMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nGeben Sie 1. Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.println("Geben Sie 2. Zahl ein: ");
        int zahl2 = scanner.nextInt();
        System.out.println("Geben Sie 3. Zahl ein: ");
        int zahl3 = scanner.nextInt();

        int max = getMaximum(zahl1, zahl2, zahl3);
        int min = getMinimum(zahl1, zahl2, zahl3);
        System.out.printf("Minimum Zahl ist %d\nMaximum Zahl ist %d\n", min, max);

    }

    public static int getMinimum(int x, int y, int z) {

        int result = Math.min(x, y);
        result = Math.min(result, z);

        return result;
    }

    public static int getMaximum(int x, int y, int z) {

        int result = Math.max(x, y);
        result = Math.max(result, z);

        return result;
    }


    // Übung5 Schaltjahr
    public static boolean isSchaltjahr(int jahr) {
        return jahr % 100 != 0 && (jahr % 4 == 0 || jahr % 400 == 0);
    }

    public static void readerSchaltjahr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nÜbung5 Schaltjahr\nGeben Sie eine Jahreszahl ein: ");

        int eingabe = scanner.nextInt();
        boolean jahr = isSchaltjahr(eingabe);
        System.out.printf("%d ist ein Schaltjahr? : %b\n", eingabe, jahr);

    }
}