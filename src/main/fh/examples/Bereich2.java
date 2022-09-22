package fh.examples;

import java.util.Scanner;

public class Bereich2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int eingabe = scanner.nextInt();
        boolean b = isImBereich(eingabe);
        System.out.printf("%d im Bereich? : %b", eingabe, b);
    }

    public static boolean isImBereich(double zahl) {
        return zahl >= 1500 && zahl <= 3500 || zahl >= 7500 && zahl <= 10000;
    }
}
