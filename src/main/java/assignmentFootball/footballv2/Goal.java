package assignmentFootball.footballv2;

public class Goal extends MatchEvent {

    protected final static int PENALTY = 0;
    protected final static int REGULAR = 1;
    protected final static int OWN_GOAL = 3;
    protected int type = REGULAR;
    protected String assist;

    public Goal(int team, MatchTime mt, String player) {
        super(team, mt, player);
    }

    public Goal(int team, MatchTime mt, String player, String assist) {
        super(team, mt, player);
        this.assist = assist;
    }

    protected Goal ownGoal() {
        type = OWN_GOAL;
        return this;
    }

    protected Goal penalty() {
        type = PENALTY;
        return this;
    }

    protected String typeString() {
        if (type == PENALTY) {
            return " P";
        } else if (type == OWN_GOAL) {
            return " OG";
        } else {
            return "";
        }
    }

    protected String description() {
        if (assist != null) {
            return super.description() + "Goal by " + player + "(assist " + assist + ")" + typeString();
        } else {
            return super.description() + "Goal by " + player + typeString();
        }
    }
}
