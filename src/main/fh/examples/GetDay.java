package fh.examples;

import java.util.Scanner;

public class GetDay {

    public static void main(String[] args) {
        reader();
    }

    public static void reader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl zwischen 1-7 ein: ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.printf("Day %d is Monday", dayNumber);
                break;
            case 2:
                System.out.printf("Day %d is Tuesday", dayNumber);
                break;
            case 3:
                System.out.printf("Day %d is Wednesday", dayNumber);
                break;
            case 4:
                System.out.printf("Day %d is Thursday", dayNumber);
                break;
            case 5:
                System.out.printf("Day %d is Friday", dayNumber);
                break;
            case 6:
                System.out.printf("Day %d is Saturday", dayNumber);
                break;
            case 7:
                System.out.printf("Day %d is Sunday", dayNumber);
                break;
            default:
                reader();
        }
    }
}
