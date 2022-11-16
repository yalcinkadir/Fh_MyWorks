package LMS.entities;

public class InternationalDelivery extends Delivery {
    private float custom;

    public InternationalDelivery(long id, String from, String to) {
        super(id, from, to);
    }

    public InternationalDelivery(long id, String from, String to, float custom) {
        super(id, from, to);
        this.custom = custom;
    }

    @Override
    public int getTotal() {
        int result=0;
        for(Item item: getGoods()){
            result += item.totalValue();
        }
        return result;
    }
}
