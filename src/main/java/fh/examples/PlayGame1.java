package fh.examples;

import java.util.Scanner;

public class PlayGame1 {

    public static void main(String[] args) {

        playGame();

    }

    public static void playGame(){
        int user1 = zahl1();
        int user2 = zahl2();
        if(user1<=50 && user1>=1) {

            for(int i=1; i<5; i++) {

                if (user1 < user2) {
                    System.out.println("kleiner");
                    user2 = zahl2();
                }
                else if (user1 > user2){
                    System.out.println("größer");
                    user2 = zahl2();
                }
                else if (user1 == user2) {
                    System.out.println("BINGO!");
                    break;
                }
            }
            System.out.println("Bye Bye!");
        } else {
            System.out.println("gib eine Zahl zwischen 1-50 ein");
        }

    }

    public static int zahl1() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("User1 deine Zahl: ");
        return scanner1.nextInt();
    }

    public static int zahl2() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("User2 rate mal die Zahl von User1: ");
        return scanner2.nextInt();
    }
}
