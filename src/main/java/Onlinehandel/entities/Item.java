package Onlinehandel.entities;

public class Item {
    private final String description;
    private final int amount;
    private final int value;

    public Item(String description, int amount, int value) {
        this.description = description;
        this.amount = amount;
        this.value = value;
    }

    public int totalValue() {
        return amount * value;

    }

    @Override
    public String toString() {
        return String.format("%s - Amount:%d (EUR %.2f) ", description, amount, value/100.);
    }
}
