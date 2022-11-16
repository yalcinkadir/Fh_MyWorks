package assignment7;

public class Max2000 extends Roboter implements ISprechenderRoboter, IMusikRoboter {
    public Max2000(String name, int gewicht, int schrittlaenge) {
        super(name, gewicht, schrittlaenge);
    }

    @Override
    public void musikSpielen() {
        System.out.println("lalala lala la");

    }

    @Override
    public void sprechen(String str) {
        System.out.println(str);

    }
}
