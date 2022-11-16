package assignmentFootball.footballv3;

public class Goal extends MatchEvent {
    private Type type = Type.REGULAR;
    private String assist;

    public Goal(MatchTime matchTime, String player, Team team, String assist) {
        super(matchTime, player, team);
        this.assist = assist;
    }

    public Goal(MatchTime matchTime, String player, Team team) {
        super(matchTime, player, team);
    }

    public Goal(Goal goal) throws MatchTimeException {
        this(goal.getMatchTime(), goal.getPlayer(), goal.getTeam());
    }

    Goal ownGoal() {
        this.type = Type.OWN_GOAL;
        return this;
    }

    Goal penalty() {
        this.type = Type.PENALTY;
        return this;
    }

    public String typeString() {
        return this.type.toString();
    }

    @Override
    String description() {
        return "Goal";
    }


    @Override
    public String toString() {
        String goalToString = super.toString();
        if (assist != null) {
            goalToString += String.format(" (assist %s)", this.assist);
        }
        if (type == Type.PENALTY) {
            goalToString += " P";
        } else if (type == Type.OWN_GOAL) {
            goalToString += " OG";
        }
        return goalToString;
    }
}
