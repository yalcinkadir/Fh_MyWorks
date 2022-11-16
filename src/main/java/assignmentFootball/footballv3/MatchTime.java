package assignmentFootball.footballv3;

import org.jetbrains.annotations.NotNull;

public class MatchTime implements Comparable<MatchTime> {
    private final int basetime;
    private int overtime;

    public MatchTime(int basetime) {
        this.basetime = basetime;
    }

    public MatchTime(int basetime, int overtime) {
        this.basetime = basetime;
        this.overtime = overtime;
    }

    int timeSegment() {
        return 0;
    }


    @Override
    public String toString() {
        if (basetime + overtime > 120) {
            return "PEN";
        } else if (overtime > 0) {
            return String.format("%s+%s", basetime, overtime);
        } else if (basetime > 0) {
            return String.format("%s", basetime);
        }
        return "0";
    }

    @Override
    public int compareTo(@NotNull MatchTime o) {
        if (this.basetime == o.basetime) {
            return Integer.compare(this.overtime, o.overtime);
        }
        return Integer.compare(this.basetime, o.basetime);
    }
}
