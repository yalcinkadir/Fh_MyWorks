package LMS.provided;

public class DateTime implements Comparable<DateTime> {

    private int year, month, day, hour, min;

    public DateTime() {
    }

    public DateTime(int year, int month, int day, int hour, int min) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d %02d:%02d (UTC)", year, month, day, hour, min);
    }

    @Override
    public int compareTo(DateTime o) {
        return Long.compare(timestamp(), o.timestamp());
    }

    public long timestamp() {
        return ((((year * 100L + month) * 100 + day) * 100 + hour) * 100 + min);
    }
}
