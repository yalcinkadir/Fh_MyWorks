package assignmentFitnessApp;

import java.util.Date;

public class Running extends BasicWorkout {
    private final int distance;

    public Running(Date date, int duration, int distance, String description) throws FitnessException {
        super(date, duration, 0, 0, description);
        this.distance = distance;
    }

    @Override
    public int getIntensity() {
        return super.getIntensity();
    }

    @Override
    public int getEnergy() {
        return intensity * 100 * duration;
    }

    @Override
    public String toString() {
        return String.format("%s, distance %s", super.toString(), distance);
    }
}
