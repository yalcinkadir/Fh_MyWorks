package assignmentFootball.footballv2;

public class Corner extends MatchEvent {
    public Corner(int team, MatchTime mt, String player) {
        super(team, mt, player);
    }

    protected String description() {
        return super.description() + "Corner by " + player;
    }
}
