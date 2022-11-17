package persondb.src.at.fhtw;

public class Person {

    public static int counter = 0;
    private String vorname;
    private String nachname;
    private int alter;

    private Group group;

    public Person(String vorname, String nachname, int alter) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(alter);
        increment();
    }

    public Person(String vorname, String nachname) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(25);
    }

    public Person() {

    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        if (alter > 15)
            this.alter = alter;
    }

    public void setAllNameFieldsAtOnce(String vorname, String nachname)
    {
        setVorname(vorname);
        setNachname(nachname);
    }

    public void setAllNameFields(String nachname, String vorname)
    {
        setVorname(vorname);
        setNachname(nachname);
    }

    public String getDisplayname()
    {
        return vorname + " " + nachname;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public static void increment()
    {
        counter++;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname + " (" + alter + ")";
    }

}
