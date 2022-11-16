package UniCampus;

public abstract class UniPerson implements Comparable<UniPerson> {
    protected String name;
    protected int alter;
    protected int id;
    protected String alterErrorMessage = "Alter kann nicht kleiner als 18 sein";
    protected String idErrorMessage = "ID darf nicht mehr als 4 Zeichen besitzen";

    public UniPerson(int id, int alter, String name) throws UniException {
        if (alter < 18) {
            throw new UniException(alterErrorMessage);
        }
        if (id > 999) {
            throw new UniException(idErrorMessage);
        }
        this.id = id;
        this.alter = alter;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("[%d] (%s) %s mit (%d) ", id, type(), name, alter);
    }

    abstract String type();
}
