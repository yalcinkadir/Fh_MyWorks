package assignmentFootball.footballv3;

import org.jetbrains.annotations.NotNull;

public abstract class MatchEvent implements Comparable<MatchEvent> {
    protected final Team team;
    private final String player;
    private MatchTime matchTime;

    public MatchEvent(MatchTime matchTime, String player, Team team) {
        this.matchTime = matchTime;
        this.player = player;
        this.team = team;
    }

    public MatchTime getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(MatchTime matchTime) {
        this.matchTime = matchTime;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s by %s", matchTime, getTeam(), description(), player);
    }

    abstract String description();

    public Team getTeam() {
        return team;
    }

    @Override
    public int compareTo(@NotNull MatchEvent o) {
        return matchTime.compareTo(o.matchTime);
    }

    public String getPlayer() {
        return player;
    }
}
