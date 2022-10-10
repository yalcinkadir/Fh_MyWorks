package fh.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>();

        while (true) {
            memory.add(reader.nextLine());
            System.out.println(memory);
        }
    }
}