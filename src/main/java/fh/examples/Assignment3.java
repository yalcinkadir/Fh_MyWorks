package fh.examples;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
/*
        // Übung1
        System.out.println("Übung1");
        printOddNumbers(getZahl());

        // Übung2
        generateOutput();

        // Übung3
        System.out.println("Übung3");
        isPrimeNumber(getZahl());
*/
        // Übung4
        System.out.println("Übung4");
        boolean result = getPI(getZahl());
        System.out.println(result);
        // Übung5


    }

    // Übung1: Write a program that prints odd numbers from 1 to n (n is a int parameter)
    public static int printOddNumbers (int n) {

        int sum = Integer.MIN_VALUE;

        for(int i=0; i<=n; i++){
            if(i%2!=0) {
                    System.out.print(i+", ");
            }
        }
        System.out.println("\n");



        return sum;
    }


    // Übung2: Write a program that generates the following output. (use loop)
    public static void generateOutput() {
        System.out.println("Übung2");
        int n = getZahl();
        int sum = Integer.MIN_VALUE;

        for(int i=0; i<=n; i++){
                for(int k=0; k<i; k++) {
                    System.out.print(i);
                }
                System.out.println("");
        }
    }

    // Übung3 Write a program that reads in one number and prints out all divisors (factors) of that number.
    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }
        }
        return true;
    }


    // Übung4: Write a function that approximates pi in n steps
    public static boolean getPI(int n) {
        // 50.000
        double piApprox = 0;
        for (int k=0; k<=n; k++) {
            piApprox += ((1/Math.pow(16,k)) * (
                    ((double)4/(8*k+1)) -
                    ((double)2/(8*k+4)) -
                    ((double)1/(8*k+5)) -
                    ((double)1/(8*k+6))));
        }
        System.out.println("PI Approx:      " + piApprox);
        System.out.println("PI Original:    " + Math.PI);
        return Math.PI == piApprox;
    }



    public static int getZahl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ihre Zahl!");
        return scanner.nextInt();
    }
}
