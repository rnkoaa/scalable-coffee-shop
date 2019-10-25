package org.agyei.richard.orders.events.model;

import java.time.Instant;

public class OrderPlacedEvent extends BaseOrderEvent {
    private final OrderInfo orderInfo;

    public OrderPlacedEvent(final OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public OrderPlacedEvent(final OrderInfo orderInfo, Instant instant) {
        super(instant);
        this.orderInfo = orderInfo;
    }


    public OrderInfo getOrderInfo() {
        return orderInfo;
    }
}
