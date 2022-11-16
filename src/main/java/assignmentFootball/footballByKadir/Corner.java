package assignmentFootball.footballByKadir;

public class Corner extends MatchEvent {


    public Corner(int team, MatchTime mt, String player) {
        super(team, mt, player);
    }

    String description() {
        String desc = "";
        desc += mt.toString();

        desc += super.description();
        desc += "Corner by ";
        if (mt.basetime <= 0) {
            desc += "<Illegal MatchTime>";
        } else {
            desc += player;
        }

        return desc;
    }
}
