package org.agyei.richard.orders.events.model;

import java.time.Instant;
import java.util.UUID;

public class OrderFailedBeansNotAvailable extends BaseOrderEvent {

    private final UUID orderId;

    public OrderFailedBeansNotAvailable(final UUID orderId) {
        this.orderId = orderId;
    }

    public OrderFailedBeansNotAvailable(final UUID orderId, final Instant instant) {
        super(instant);
        this.orderId = orderId;
    }


    public UUID getOrderId() {
        return orderId;
    }

}