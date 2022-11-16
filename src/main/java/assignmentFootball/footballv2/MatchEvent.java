package assignmentFootball.footballv2;

import org.jetbrains.annotations.NotNull;

public class MatchEvent implements Comparable {

    protected final static int HOME = 0;
    protected final static int GUEST = 1;
    protected int team;
    MatchTime mt;
    String player;

    public MatchEvent(int team, MatchTime mt, String player) {
        this.team = team;
        this.mt = mt;
        this.player = player;
    }

    String description() {

        if (getTeam() == MatchEvent.HOME) {
            return mt.toString() + " Home: ";
        } else {
            return mt.toString() + " Guest: ";
        }
    }

    public int getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "MatchEvent{" +
                "team=" + team +
                ", mt=" + mt +
                ", player='" + player + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}