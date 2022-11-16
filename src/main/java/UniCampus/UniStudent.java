package UniCampus;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UniStudent extends UniPerson {
    protected String klasse;
    protected List<UniLehrer> uniLehrerList;

    public UniStudent(int id, int alter, String name) throws UniException {
        super(id, alter, name);
    }

    public UniStudent(int id, int alter, String name, String klasse) throws UniException {
        super(id, alter, name);
        this.klasse = klasse;
    }

    public UniStudent(int id, int alter, String name, String klasse, List<UniLehrer> uniLehrerList) throws UniException {
        super(id, alter, name);
        this.klasse = klasse;
        this.uniLehrerList = uniLehrerList;
    }

    @Override
    public int compareTo(@NotNull UniPerson o) {
        if (o instanceof UniStudent) {
            UniStudent uniStudent = (UniStudent) o;
            return String.CASE_INSENSITIVE_ORDER.compare(this.klasse, uniStudent.klasse);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%sist in der Klasse %s bekommt von Lehrern %s unterrichtet."
                , super.toString(), klasse, uniLehrerList);
    }

    @Override
    String type() {
        return "Student";
    }
}
