package org.agyei.richard.orders.events.model;

import java.time.Instant;
import java.util.Objects;

public abstract class BaseOrderEvent {
    private final Instant instant;

    public BaseOrderEvent() {
        this.instant = Instant.now();
    }

    protected BaseOrderEvent(Instant instant) {
        Objects.requireNonNull(instant);
        this.instant = instant;
    }

    public Instant getInstant() {
        return instant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseOrderEvent that = (BaseOrderEvent) o;
        return instant.equals(that.instant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instant);
    }
}
