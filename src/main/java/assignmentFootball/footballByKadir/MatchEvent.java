package assignmentFootball.footballByKadir;

import org.jetbrains.annotations.NotNull;

public class MatchEvent implements Comparable {

    final static int HOME = 0;
    final static int GUEST = 1;
    int team;
    String player;
    MatchTime mt;

    public MatchEvent(int team, MatchTime mt, String player) {
        this.team = team;
        this.player = player;
        this.mt = mt;
    }

    @Override
    public String toString() {
        return "MatchEvent{" +
                "team=" + team +
                ", player='" + player + '\'' +
                ", mt=" + mt +
                '}';
    }

    public int compareTo(@NotNull Object o) {

        MatchEvent me = (MatchEvent) o;

        return me.mt.compareTo(this.mt);

    }

    String description() {
        if (getTeam() == 0) {
            return " Home: ";
        } else {
            return " Guest: ";
        }
    }

    public int getTeam() {
        return team;
    }
}
