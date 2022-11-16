package LMS.entities;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private final String description;
    private final int amount;
    private final float mass;
    private final long value;

    public Item(String description, int amount, float mass, long value) {
        this.description = description;
        this.amount = amount;
        this.mass = mass;
        this.value = value;
    }

    public float totalValue() {
        return amount * value;
    }

    public float totalMass() {
        return amount * mass;
    }

    @Override
    public String toString() {
        return String.format("%d x %.15s (%.1fkg EUR %d.%02d, %.1fkg EUR %d.%02d)", amount, description, mass,
                ((int) value) / 100, ((int) value) % 100, totalMass(), ((int) totalValue()) / 100,
                ((int) totalValue()) % 100);
    }
}
