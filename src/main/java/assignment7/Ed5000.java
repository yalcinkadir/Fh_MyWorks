package assignment7;

public class Ed5000 extends Roboter implements IMusikRoboter {
    public Ed5000(String name, int gewicht, int schrittlaenge) {
        super(name, gewicht, schrittlaenge);
    }


    @Override
    public void musikSpielen() {
        System.out.println("lalala lala la");

    }
}
