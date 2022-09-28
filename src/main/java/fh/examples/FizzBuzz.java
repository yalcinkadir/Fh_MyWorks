package fh.examples;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        for (String s : fizzBuzz(15)) {
            System.out.print(s);
        }
    }

    public static String[] fizzBuzz(int n) {

        String[] myArray = new String[n];
        for (int i = 1; i <= n; i++) {
            String entry = String.valueOf(i);
            if (i % 3 == 0 && i % 5 == 0) {
                entry = "FizzBuzz";
            } else if (i % 3 == 0) {
                entry = "Fizz";
            } else if (i % 5 == 0) {
                entry = "Buzz";
            }
            myArray[i-1] = entry + ", ";
        }
        return myArray;
    }

}
