package assignmentFitnessApp;

import java.util.Date;

public class BasicWorkout {
    protected int duration;
    protected int intensity;
    protected int energy;
    protected Date date;
    protected String description;

    String durationErrorMessage = "duration must be greater than 0";
    String intensityErrorMessage = "intensity must be between 0-10";
    String energyErrorMessage = "energy must be greater than 0";

    public BasicWorkout(Date date, int duration) throws FitnessException {
        if (duration < 0) {
            throw new FitnessException(durationErrorMessage);
        }
        this.date = date;
        this.duration = duration;
    }

    public BasicWorkout(Date date, int duration, int intensity) throws FitnessException {
        this(date, duration);
        if (intensity > 11 || intensity < 0) {
            throw new FitnessException(intensityErrorMessage);
        }
        this.intensity = intensity;
    }

    public BasicWorkout(Date date, int duration, int intensity, int energy) throws FitnessException {
        this(date, duration, intensity);
        this.energy = energy;
    }

    public BasicWorkout(Date date, int duration, int intensity, int energy, String description) throws FitnessException {
        this(date, duration, intensity, energy);
        this.description = (description == null) ? null : String.format("%.100s", description);
    }

    public BasicWorkout(BasicWorkout basicWorkout) throws FitnessException {
        this(basicWorkout.date, basicWorkout.duration, basicWorkout.intensity, basicWorkout.energy, basicWorkout.description);
    }

    @Override
    public String toString() {
        return String.format("%s: %s \"%s\" %.1fh, %dkcal ",
                date, getIntensityString(), getDescription(), duration / 3600., getEnergy());
    }

    public String getDescription() {
        if (description == null) {
            return "<no description>";
        }
        return description;
    }

    public int getIntensity() {
        return intensity;
    }

    public int getEnergy() {
        return energy;
    }

    public final String getIntensityString() {
        String intensityString = "";
        for (int i = 0; i < 10; i++) {
            intensityString += ((i < intensity) ? "*" : " ");
        }
        return String.format("[%s]", intensityString);
    }
}
