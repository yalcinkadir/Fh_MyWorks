package assignmentFootball.footballv3;

public class Corner extends MatchEvent {


    public Corner(MatchTime matchTime, String player, Team team) throws MatchTimeException {
        super(matchTime, player, team);
    }


    public Corner(Corner corner) throws MatchTimeException {
        super(corner.getMatchTime(), corner.getPlayer(), corner.getTeam());
    }

    @Override
    String description() {
        return "Corner";
    }
}
