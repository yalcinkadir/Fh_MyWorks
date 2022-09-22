package fh.examples;

import java.util.Scanner;

public class Assignment2 {

    static final int pin = 1235;

    public static void main(String[] args) {

        // Übung1
        System.out.println("\nÜbung1 Sum von Zahlen bis N");
        int sum = getSumFrom1ToN(getZahl());
        System.out.printf("Sum %d", sum);

        // Übung2
        System.out.println("\nÜbung2 Sum von gegebenen Zahlen");
        readAndSumInts();

        // Übung3
        System.out.println("\nÜbung3 PIN Check");
        suggestPin();

        // Übung4
        System.out.println("\nÜbung4 Prime Zahlen Check");
        boolean getPrime = isPrime(getZahl());
        System.out.printf("Given Number is Prime: %b\n", getPrime);

        // Übung5
        int max1 = getMax(new int[]{55, 48, 1, 0, 94, 25, 8});
        System.out.println("\nÜbung 5\nGrößte Zahl in der ersten Schleife: " + max1);
        int max2 = getMax(new int[]{0, 546, -34, 132, 99});
        System.out.println("Größte Zahl in der zweiten Schleife: " + max2);
    }

    public static int getSumFrom1ToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void readAndSumInts() {
        int zahl = getZahl();
        int sum = 0;

        do {
            sum += zahl;
            zahl = getZahl();
        } while (zahl > 0);
        System.out.printf("Sum %d", sum);
    }

    public static void suggestPin() {
        boolean pinCorrect = false;

        for (int i = 1; i <= 3; i++) {

            int tryPin = getZahl();
            if (tryPin == pin) {
                System.out.println("Correct, welcome back.");
                pinCorrect = true;
                break;
            } else {
                System.out.println("Incorrect, try again.");
            }
        }

        if(!pinCorrect) {
            System.out.println("Sorry but you have been locked out.");
        }
    }

    public static boolean isPrime(int n){


            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static int getMax(int[] numbers){

        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }


    public static int getZahl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ihre Zahl!");
        return scanner.nextInt();
    }
}
