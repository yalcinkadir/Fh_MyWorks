package Onlinehandel.entities;

import Onlinehandel.provided.Costumer;

public class RegionalOrder extends Order {
    private boolean express;


    public RegionalOrder(long id, Costumer c, Iterable<Item> items) {
        super(id, c, items);
    }

    public RegionalOrder(long id, Costumer costumer, Iterable<Item> items, boolean express) {
        super(id, costumer, items);
        this.express = express;
    }

    public RegionalOrder(Order orig) {
        super(orig);
    }

    @Override
    public int getTotal() {
        int result = 0;
        for (Item item : getItems()) {
            result += item.totalValue();
        }
        return result;
    }
}
