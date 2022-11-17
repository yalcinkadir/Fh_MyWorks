package Onlinehandel.entities;

import Onlinehandel.provided.Costumer;
import Onlinehandel.provided.DateTime;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * An order within the Onlinehandel.<br>
 * <br>
 * <p>
 * An order holds information on the costumer placing the order, the items
 * ordered and the status of the order which captures collection and delivery
 * date and time.<br>
 * <br>
 * <p>
 * The usual life cycle is
 * <ul>
 * <li>create an order with id, costumer and at least one item</li>
 * <li>add items</li>
 * <li>collect</li>
 * <li>deliver</li>
 * </ul>
 */
public abstract class Order implements Comparable<Order> {
    private final long id;
    private Set<Item> goods = new HashSet<>();
    private final Costumer costumer;
    private DateTime collected;
    private DateTime delivered;

    public Order(long id, Costumer costumer, Iterable<Item> items) {
        if (id < 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        this.id = id;
        this.costumer = costumer;
        this.addItems(items);
    }

    public Order(Order order) {
        this.id = order.getId();
        this.collected = order.getCollected();
        this.delivered = order.getDelivered();
        this.goods = order.getGoods();
        this.costumer = order.getCostumer();
    }

    public final boolean addItems(Item item) {
        return goods.add(item);
    }

    public final boolean addItems(Iterable<Item> items) {
        return goods.addAll(new HashSet<Item>((Collection) items));
    }

    public Set<Item> getItems() {
        return goods;
    }

    public final boolean collect(DateTime toc) {
        if (collected == null) {
            this.collected = toc;
            return true;
        }
        return false;
    }


    public final boolean deliver(DateTime tod) {
        if (collected == null) {
            this.collected = tod;
            return true;
        }
        return false;
    }


    private final String ensureNonNullNonEmpty(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        } else {
            throw new IllegalArgumentException("Giving String is Empty or Null");
        }
    }

    public long getId() {
        return id;
    }

    public DateTime getCollected() {
        return collected;
    }

    public DateTime getDelivered() {
        return delivered;
    }

    public Set<Item> getGoods() {
        return goods;
    }

    public abstract int getTotal();

    public boolean isCollected() {
        return this.collected != null;
    }

    public boolean isDelivered() {
        return this.delivered != null;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    @Override
    public int compareTo(@NotNull Order argO) {
        return Long.compare(this.id, argO.id);
    }

    /**
     * creates a string representation of this delivery.<br>
     *
     * @ProgrammingProblem.Hint provided
     */
    @Override
    public String toString() {
        return String.format("%d " + "[%scollected, %sdelivered] (EUR %.2f)\n" + "%s", //
                id, isCollected() ? "" : "not ", isDelivered() ? "" : "not ", getTotal() / 100.,
                goods == null ? "no stock" : goods);
    }

}
