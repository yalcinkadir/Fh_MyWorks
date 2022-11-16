package assignmentFootball.footballByKadir;

public class Goal extends MatchEvent {

    int PENALTY = 1;
    int REGULAR = 0;
    int OWN_GOAL = 3;

    int type = REGULAR;
    String assist;

    public Goal(int team, MatchTime mt, String player) {
        super(team, mt, player);
    }

    public Goal(int team, MatchTime mt, String player, String assist) {
        super(team, mt, player);
        this.assist = assist;
    }

    Goal ownGoal() {
        type = OWN_GOAL;
        return this;
    }

    Goal penalty() {
        type = PENALTY;
        return this;
    }

    String typeString() {
        if (type == PENALTY) {
            return " P";
        } else if (type == OWN_GOAL) {
            return " OG";
        } else {
            return "";
        }
    }

    //  [0] Guest: Goal by <Illegal MatchTime> (assist NN)
    String description() {
        String desc = "";
        desc += mt.toString();

        desc += super.description();
        desc += "Goal by ";
        if (mt.basetime <= 0) {
            desc += "<Illegal MatchTime>";
        } else {
            desc += player;
        }

        desc += typeString();
        if (assist != null) {
            desc += " (assist " + this.assist + ")";
        }
        return desc;
    }
}
