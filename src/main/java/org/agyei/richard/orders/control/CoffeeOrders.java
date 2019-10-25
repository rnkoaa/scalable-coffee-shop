package org.agyei.richard.orders.control;

public class CoffeeOrders {
}
/*
@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class CoffeeOrders {

    private Map<UUID, CoffeeOrder> coffeeOrders = new ConcurrentHashMap<>();

    public CoffeeOrder get(final UUID orderId) {
        return coffeeOrders.get(orderId);
    }

    public void apply(@Observes OrderPlaced event) {
        coffeeOrders.putIfAbsent(event.getOrderInfo().getOrderId(), new CoffeeOrder());
        applyFor(event.getOrderInfo().getOrderId(), o -> o.place(event.getOrderInfo()));
    }

    public void apply(@Observes OrderCancelled event) {
        applyFor(event.getOrderId(), CoffeeOrder::cancel);
    }

    public void apply(@Observes OrderAccepted event) {
        applyFor(event.getOrderInfo().getOrderId(), CoffeeOrder::accept);
    }

    public void apply(@Observes OrderStarted event) {
        applyFor(event.getOrderId(), CoffeeOrder::start);
    }

    public void apply(@Observes OrderFinished event) {
        applyFor(event.getOrderId(), CoffeeOrder::finish);
    }

    public void apply(@Observes OrderDelivered event) {
        applyFor(event.getOrderId(), CoffeeOrder::deliver);
    }

    private void applyFor(final UUID orderId, final Consumer<CoffeeOrder> consumer) {
        final CoffeeOrder coffeeOrder = coffeeOrders.get(orderId);
        if (coffeeOrder != null)
            consumer.accept(coffeeOrder);
    }

}
 */