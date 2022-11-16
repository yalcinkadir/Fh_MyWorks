package assignmentFootball.footballv3;

import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) throws MatchTimeException {

        List<MatchEvent> history = new LinkedList<MatchEvent>();
        history.add(new Corner(new MatchTime(110), "Kainz", Team.GUEST));
        history.add(new Goal(new MatchTime(75), "Arnautovic", Team.GUEST, "Alaba"));
        history.add(new Goal(new MatchTime(45, 4), "Ronaldo", Team.GUEST).ownGoal());
        history.add(new Goal(new MatchTime(45, 2), "Holzhauser", Team.GUEST).ownGoal());
        history.add(new Goal(new MatchTime(150), "Schaub", Team.HOME).penalty());
        history.add(new Goal(new MatchTime(45, 2), "Arnautovic", Team.HOME).penalty());
        history.add(new Goal(new MatchTime(90, 5), "Arnautovic", Team.GUEST, "Alaba"));
        history.add(new Goal(new MatchTime(22), "Alaba", Team.HOME, "Arnautovic"));
        history.add(new Goal(new MatchTime(-9), "<Illegal MatchTime>", Team.GUEST, "NN"));

        sort(history);
        for (MatchEvent matchEvent : history) {
            System.out.println(matchEvent.toString());
        }


    }
}
