package assignmentFootball.footballv2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class MainFootballv2 {

    public static void main(String[] args) {

        List<MatchEvent> history = new LinkedList<MatchEvent>();
        history.add(new Corner(MatchEvent.GUEST, new MatchTime(110), "Kainz"));
        history.add(new Goal(MatchEvent.GUEST, new MatchTime(75), "Arnautovic", "Alaba"));
        history.add(new Goal(MatchEvent.GUEST, new MatchTime(45, 4), "Ronaldo").ownGoal());
        history.add(new Goal(MatchEvent.GUEST, new MatchTime(45, 2), "Holzhauser").ownGoal());
        history.add(new Goal(MatchEvent.HOME, new MatchTime(150), "Schaub").penalty());
        history.add(new Goal(MatchEvent.HOME, new MatchTime(45, 2), "Arnautovic").penalty());
        history.add(new Goal(MatchEvent.GUEST, new MatchTime(90, 5), "Arnautovic", "Alaba"));
        history.add(new Goal(MatchEvent.HOME, new MatchTime(22), "Alaba", "Arnautovic"));
        history.add(new Goal(MatchEvent.GUEST, new MatchTime(-9), "<Illegal MatchTime>", "NN"));

        sort(history);
        for (MatchEvent m : history) {
            System.out.println(m.description());
        }

        System.out.println();
        List<MatchEvent> filter = history.stream().
                filter(matchEvent -> matchEvent.getTeam() == MatchEvent.GUEST).sorted().collect(Collectors.toList());

        System.out.println(filter);
    }
}
