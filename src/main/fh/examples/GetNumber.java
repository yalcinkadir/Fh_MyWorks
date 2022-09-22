package fh.examples;

import java.util.Scanner;

public class GetNumber {

    public static void main(String[] args) {
        reader();
    }

    public static void reader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int gibZahl = scanner.nextInt();
        if (gibZahl >= 0) {
            System.out.printf("+%d ist eine positive Zahl", gibZahl);
        } else {
            System.out.printf("%d ist eine negative Zahl", gibZahl);
        }
    }
}
