package UniCampus;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UniLehrer extends UniPerson {
    protected int erfahrungsjahr;

    List<UniTopics> topics;

    public UniLehrer(int id, int alter, String name) throws UniException {
        super(id, alter, name);
    }

    public UniLehrer(int id, int alter, String name, List<UniTopics> uniTopicsList) throws UniException {
        this(id, alter, name);
        this.topics = uniTopicsList;
    }

    public UniLehrer(int id, int alter, String name, List<UniTopics> topics, int erfahrungsjahr) throws UniException {
        this(id, alter, name, topics);
        this.erfahrungsjahr = erfahrungsjahr;
    }

    public void setErfahrungsjahr(int erfahrungsjahr) {
        this.erfahrungsjahr = erfahrungsjahr;
    }

    @Override
    public int compareTo(@NotNull UniPerson o) {
        UniLehrer uniLehrer = (UniLehrer) o;
        return Integer.compare(this.erfahrungsjahr, uniLehrer.erfahrungsjahr);
    }

    @Override
    public String toString() {
        return String.format("%s hat %s Jahre Erfahrung und unterrichtet in folgenden Fächern: %s"
                , super.toString(), erfahrungsjahr, topics);
    }

    @Override
    String type() {
        return "Lehrer";
    }
}
