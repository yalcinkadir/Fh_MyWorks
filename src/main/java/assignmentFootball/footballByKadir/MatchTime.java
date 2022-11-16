package assignmentFootball.footballByKadir;

import org.jetbrains.annotations.NotNull;

public class MatchTime implements Comparable {

    final static int HALF_ONE = 1;
    final static int HALF_TWO = 2;
    final static int EXTRATIME_ONE = 3;
    final static int EXTRATIME_TWO = 4;
    final static int PENALTY_SHOOTOUT = 5;

    int basetime;
    int overtime;

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

    int segment() {
        return 0;
    }

    @Override
    public String toString() {

        if (basetime + overtime > 120) {
            return "[PEN]";
        }
        String result = "[" + basetime;
        if (overtime != 0) {
            result += "+" + overtime;
        }
        return result + "]";
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
