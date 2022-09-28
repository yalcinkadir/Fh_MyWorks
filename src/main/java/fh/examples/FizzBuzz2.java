package fh.examples;

import java.util.*;

class OutputExample{
    public static void main(String[] args) {

        //System.out.println(getSumFrom1ToN(100));
        //readAndSumInts();
        //tresor();
        //System.out.println(isPrime(1));
        //int[] numbers = {-55, -48, -1, -94, -25, -8};
        //System.out.println(getMax(numbers));

        System.out.print(fizzBuzz(20));

    }

    public static int getSumFrom1ToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void readAndSumInts() {
        Scanner sc = new Scanner(System.in);
        int eingabe = 0;
        int sum = 0;
        do {
            System.out.print("Zahl: ");
            eingabe = sc.nextInt();
            sum += eingabe;
        } while (eingabe != 0);
        System.out.printf("Summe: %d\n",  sum);
    }

    public static void tresor() {
        final String PIN = "0000";
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Pin: ");
            String eingabe = sc.next();
            if (PIN.equals(eingabe)) {
                System.out.println("Correct, welcome back.");
                break;
            } else if (i < 3) {
                System.out.println("Incorrect, try again.");
            } else {
                System.out.println("Sorry but you have been locked out");
            }
        }
    }


    public static boolean isPrime(int n) {
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

    public static int getMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String entry = String.valueOf(i);
            if (i % 3 == 0 && i % 5 == 0) {
                entry = "FizzBuzz";
            } else if (i % 3 == 0) {
                entry = "Fizz";
            } else if (i % 5 == 0) {
                entry = "Buzz";
            }
            myList.add(entry + " ");
        }
        return myList;
    }
}