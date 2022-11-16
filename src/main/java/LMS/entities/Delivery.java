package LMS.entities;

import LMS.provided.DateTime;
import LMS.provided.Vehicle;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public abstract class Delivery implements Comparable<Delivery> {
    private final long id;
    private final String from;
    private final String to;
    private DateTime collected;
    private DateTime delivered;
    private Vehicle carrier;
    private final Set<Item> goods = new HashSet<>();


    public Delivery(long id, String from, String to) {
        this.id = id;
        this.from = from;
        this.to = to;
    }

    public abstract int getTotal();

    protected final float totalMass() {
        int result=0;
        for(Item item: goods){
            result += item.totalMass();
        }
        return result;
    }

    public boolean isCollected() {
        LocalDateTime lokalDateTime = LocalDateTime.now();
        if(collected!=null){

        int result = collected.compareTo(new DateTime(lokalDateTime.getYear(),
                lokalDateTime.getMonthValue(), lokalDateTime.getDayOfMonth(), lokalDateTime.getHour(), lokalDateTime.getMinute()));
        return result <0; }
        else {return false;}
    }

    public boolean isDelivered() {
        LocalDateTime lokalDateTime = LocalDateTime.now();
        if(delivered!=null){

            int result = delivered.compareTo(new DateTime(lokalDateTime.getYear(),
                    lokalDateTime.getMonthValue(), lokalDateTime.getDayOfMonth(), lokalDateTime.getHour(), lokalDateTime.getMinute()));
            return result <0; }
        else {return false;}
    }

    private boolean isAssigned() {
        return carrier!=null;
    }

    public final boolean addGoods(Item good) {
        return goods.add(good);
    }

    public final boolean addGoods(Iterable<Item> goodList) {
        return goods.addAll(StreamSupport.stream(goodList.spliterator(), false)
                .collect(Collectors.toList()));
    }

    public Set<Item> getGoods() {
        return goods;
    }

    public final void assignCarrier(Vehicle vehicle) {
        carrier = vehicle;
    }

    public final boolean collect(DateTime dateTime) { collected=dateTime;
        return true;
    }

    public final boolean deliver(DateTime dateTime) { delivered=dateTime;
        return true;
    }

    private String ensureNonNullNonEmpty(String val) {
        return "";
    }

    @Override
    public int compareTo(@NotNull Delivery o) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format(
                "%d from \"%10.10s\" to \"%10.10s\" " + "[%scollected, %sdelivered] (%.2fkg, EUR %.2f)\n" + "%s", id,
                from, to, isCollected() ? "" : "not ", isDelivered() ? "" : "not ", totalMass(), getTotal() / 100.,
                goods == null ? "no stock" : goods);
    }

}


