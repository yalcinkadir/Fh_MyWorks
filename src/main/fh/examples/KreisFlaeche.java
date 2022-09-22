package fh.examples;

import java.util.Scanner;

public class KreisFlaeche {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Radius ein: ");
        double eingabe = scanner.nextDouble();
        double flaeche = getKreisFleche(eingabe);
        System.out.printf("der Flächeninhalt beträgt: %f", flaeche);

    }

    private static double getKreisFleche(double radius) {
        return Math.PI * Math.pow(radius, 2);

    }
}
