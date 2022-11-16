package assignmentFootball.footballv2;

import org.jetbrains.annotations.NotNull;

public class MatchTime implements Comparable {

    protected final static int PENALTY_SHOOTOUT = 5;
    protected final static int EXTRATIME_TWO = 4;
    protected final static int EXTRATIME_ONE = 3;
    protected final static int HALF_TWO = 2;
    protected final static int HALF_ONE = 1;
    protected int basetime;
    protected int overtime;

    public MatchTime(int basetime) {
        if (basetime <= 0) {
            this.basetime = 0;
        } else {
            this.basetime = basetime;
        }
    }

    public MatchTime(int basetime, int overtime) {
        if (basetime <= 0) {
            this.basetime = 0;
        } else {
            this.basetime = basetime;
        }
        this.overtime = overtime;
    }

    protected int segment() {
        return 0;
    }

    @Override
    public String toString() {
        if (basetime + overtime > 120) {
            return "[PEN]";
        }
        if (overtime != 0) {
            return "[" + basetime + "+" + overtime + "]";
        }
        return "[" + basetime + "]";
    }

    @Override
    public int compareTo(@NotNull Object o) {
        MatchTime mt = (MatchTime) o;

        if (mt.basetime > this.basetime) {
            return 1;
        } else {
            return -1;
        }
    }
}
