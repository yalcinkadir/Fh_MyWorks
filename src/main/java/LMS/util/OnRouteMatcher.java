package LMS.util;

import LMS.entities.Delivery;

public class OnRouteMatcher {

    public boolean matches(Delivery delivery) {
        return delivery.isCollected();
    }
}
