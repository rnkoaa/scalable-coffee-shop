package org.agyei.richard.barista.events.control;

public class CoffeeBrews {
    /*

    private final Set<UUID> unfinishedBrews = new ConcurrentSkipListSet<>();
    private final Set<UUID> undeliveredOrders = new ConcurrentSkipListSet<>();

    public Collection<UUID> getUnfinishedBrews() {
        return unmodifiableCollection(unfinishedBrews);
    }

    public Collection<UUID> getUndeliveredOrders() {
        return unmodifiableCollection(undeliveredOrders);
    }

    public void apply(@Observes CoffeeBrewStarted event) {
        unfinishedBrews.add(event.getOrderInfo().getOrderId());
    }

    public void apply(@Observes CoffeeBrewFinished event) {
        final Iterator<UUID> iterator = unfinishedBrews.iterator();
        while (iterator.hasNext()) {
            final UUID orderId = iterator.next();
            if (orderId.equals(event.getOrderId())) {
                iterator.remove();
                undeliveredOrders.add(orderId);
            }
        }
    }

    public void apply(@Observes CoffeeDelivered event) {
        undeliveredOrders.removeIf(i -> i.equals(event.getOrderId()));
    }
     */
}
