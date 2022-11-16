package assignment7;

public class Tom3000 extends Roboter implements ISprechenderRoboter {

    public Tom3000(String name, int gewicht, int schrittlaenge) {
        super(name, gewicht, schrittlaenge);
    }

    @Override
    public void sprechen(String str) {
        System.out.println(str);
    }


}
