package fh.examples.examples;

public class Tests {
    public static void main(String[] args) {
        getCars();
        getContinue();
        getTryCatch();

    }

    public static void getCars() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void getContinue() {
        for (int i = 0; i <= 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void getTryCatch() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[5]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }


}
