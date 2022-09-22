package fh.examples.examples;

import java.util.Scanner;

public class Bereich1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl: ");
        int eingabe = scanner.nextInt();
        boolean b = isImBereich(eingabe);
        System.out.printf("%d im Bereich? : %b", eingabe, b);

    }

    public static boolean isImBereich(int zahl) {
        return zahl >= 1500 && zahl <= 3500;

    }

}


