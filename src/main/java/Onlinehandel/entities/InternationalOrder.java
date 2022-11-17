package Onlinehandel.entities;

import Onlinehandel.provided.Costumer;

public class InternationalOrder extends Order {
    private float custom;

    public InternationalOrder(long id, Costumer c, Iterable<Item> items, float custom) {
        super(id, c, items);
        this.custom = custom;
    }

    public InternationalOrder(long id, Costumer c, Iterable<Item> items) {
        super(id, c, items);
    }

    public InternationalOrder(Order orig, float custom, Iterable<Item> items) {
        super(orig);
        this.custom = custom;
        this.addItems(items);
    }

    public InternationalOrder(Order orig) {
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
