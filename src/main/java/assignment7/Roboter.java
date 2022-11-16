package assignment7;

public class Roboter {

    private final String className = this.getClass().getSimpleName();
    private String name;
    private int gewicht;
    private int schrittlaenge;

    public Roboter(String name, int gewicht, int schrittlaenge) {
        this.name = name;
        this.gewicht = gewicht;
        this.schrittlaenge = schrittlaenge;
    }

    @Override
    public String toString() {
        return "Roboter{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                ", schrittlaenge=" + schrittlaenge +
                ", className='" + className + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getSchrittlaenge() {
        return schrittlaenge;
    }

    public void setSchrittlaenge(int schrittlaenge) {
        this.schrittlaenge = schrittlaenge;
    }


    public void gehen(int anzSchritte) {
        System.out.println(className + "(" + name + ")" + " geht " + (anzSchritte * this.schrittlaenge) / 100 + "." + (anzSchritte * this.schrittlaenge) % 100 + " meter");

        if (gewicht > 15) {
            anzSchritte -= 5;
            if (anzSchritte > 0) {
                System.out.println("Pause...");
                gehen(anzSchritte);
            }
        } else if (gewicht > 10) {
            anzSchritte -= 10;
            if (anzSchritte > 0) {
                System.out.println("Pause...");
                gehen(anzSchritte);
            }
        } else if (gewicht > 5) {
            anzSchritte -= 15;
            if (anzSchritte > 0) {
                System.out.println("Pause...");
                gehen(anzSchritte);
            }
        } else {
            anzSchritte -= 20;
            if (anzSchritte > 0) {
                System.out.println("Pause...");
                gehen(anzSchritte);
            }
        }

    }
}
