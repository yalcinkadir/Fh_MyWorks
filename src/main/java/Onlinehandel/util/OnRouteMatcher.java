package Onlinehandel.util;

import Onlinehandel.entities.Order;
import Onlinehandel.provided.Matcher;

public class OnRouteMatcher
        implements Matcher<Order> {

    public OnRouteMatcher() {
    }

    @Override
    public boolean matches(Order t) {
        return t.isCollected() && !t.isDelivered();
    }
}
