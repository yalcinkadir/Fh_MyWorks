package assignmentFitnessApp;

import java.util.Date;

public class MainFitnessApp {
    public static void main(String[] args) {
        for (BasicWorkout b : getDemoData()) {
            System.out.println(b.toString());
        }
    }

    public static BasicWorkout[] getDemoData() {

        try {
            return new BasicWorkout[]{
                    new BasicWorkout(new Date(2018, 04, 1), 8200, 7, 1200, "Bike trip to Krems"),
                    new BasicWorkout(new Date(2018, 04, 1), 8200, 11, 1200, "Bike trip to Krems"),
                    new BasicWorkout(new Date(2018, 05, 8), 1200, 5, 500, "Digging a hole"),
                    new Running(new Date(2018, 05, 7), 3600, 12000, "Evening run from work to home"),
            };
        } catch (FitnessException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static double meanIntensity(BasicWorkout[] data) {

        return 0;
    }

    public static int totalEnergy(BasicWorkout[] data) {

        return 0;
    }

    public static void print(BasicWorkout[] data) {

    }
}
