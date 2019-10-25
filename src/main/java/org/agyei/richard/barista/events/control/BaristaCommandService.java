package org.agyei.richard.barista.events.control;

public class BaristaCommandService {
    /*
    public class BaristaCommandService {

    @Inject
    EventProducer eventProducer;

    @Inject
    CoffeeBrews coffeeBrews;

    @Inject
    Logger logger;

    void makeCoffee(final OrderInfo orderInfo) {
        eventProducer.publish(new CoffeeBrewStarted(orderInfo));
    }

    void checkCoffee() {
        final Collection<UUID> unfinishedBrews = coffeeBrews.getUnfinishedBrews();
        logger.info("checking " + unfinishedBrews.size() + " unfinished brews");
        unfinishedBrews.forEach(i -> {
            if (new Random().nextBoolean())
                eventProducer.publish(new CoffeeBrewFinished(i));
        });
    }

    void checkCustomerDelivery() {
        final Collection<UUID> undeliveredOrder = coffeeBrews.getUndeliveredOrders();
        logger.info("checking " + undeliveredOrder.size() + " un-served orders");
        undeliveredOrder.forEach(i -> {
            if (new Random().nextBoolean())
                eventProducer.publish(new CoffeeDelivered(i));
        });
    }

}
     */
}
