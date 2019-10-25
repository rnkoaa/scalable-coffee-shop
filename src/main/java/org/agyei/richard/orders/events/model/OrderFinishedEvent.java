package org.agyei.richard.orders.events.model;

import java.time.Instant;
import java.util.UUID;

public class OrderFinishedEvent extends BaseOrderEvent {
    private final UUID orderId;

    protected OrderFinishedEvent(final UUID id) {
        super();
        this.orderId = id;
    }


    public OrderFinishedEvent(final UUID orderId, final Instant instant) {
        super(instant);
        this.orderId = orderId;
    }

//    public OrderStarted(final JsonObject jsonObject) {
//        this(UUID.fromString(jsonObject.getString("orderId")), Instant.parse(jsonObject.getString("instant")));
//    }

    public UUID getOrderId() {
        return orderId;
    }
}
