package assignmentFootball.footballv3;

public enum Team {
    HOME,
    GUEST;

    @Override
    public String toString() {
        if (this == GUEST) {
            return "Guest:";
        } else {
            return "Home:";
        }
    }
}
