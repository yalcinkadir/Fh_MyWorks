package LMS.provided;

public class Vehicle {
    private final String registration;
    private final int maxLoad;
    private final Driver driver;

    public Vehicle(String registration, int maxLoad, Driver driver) {
        this.registration = registration;
        this.maxLoad = maxLoad;
        this.driver = driver;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", registration, maxLoad, driver);
    }

}
