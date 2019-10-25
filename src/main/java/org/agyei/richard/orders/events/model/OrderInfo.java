package org.agyei.richard.orders.events.model;

import java.util.UUID;

public class OrderInfo {
    private final UUID orderId;
    private final CoffeeType type;
    private final String beanOrigin;

    public OrderInfo(final UUID orderId, final CoffeeType type, final String beanOrigin) {
        this.orderId = orderId;
        this.type = type;
        this.beanOrigin = beanOrigin;
    }



    public UUID getOrderId() {
        return orderId;
    }

    public CoffeeType getType() {
        return type;
    }

    public String getBeanOrigin() {
        return beanOrigin;
    }
}
