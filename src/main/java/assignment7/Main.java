package assignment7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tom3000 tom3000 = new Tom3000("Thomas", 5, 20);
        Max2000 max2000 = new Max2000("Markus", 10, 15);
        Ed5000 ed5000 = new Ed5000("Edin", 20, 10);

        List<Roboter> roboters = new ArrayList<>();
        roboters.add(tom3000);
        roboters.add(max2000);
        roboters.add(ed5000);

        roboterList(roboters);

        tom3000.gehen(35);
        max2000.gehen(13);
        ed5000.gehen(12);

    }

    public static void roboterList(List<Roboter> roboterArrayList) {

        System.out.println("ArrayList: ");
        for (Roboter roboter : roboterArrayList) {
            System.out.println(roboter.toString() + ", ");
            if (roboter instanceof IMusikRoboter) {
                ((IMusikRoboter) roboter).musikSpielen();
            }
            if (roboter instanceof ISprechenderRoboter) {
                ((ISprechenderRoboter) roboter).sprechen("Hallo, ich bin ein Roboter und kann auch sprechen!");
            }
        }
    }
}
