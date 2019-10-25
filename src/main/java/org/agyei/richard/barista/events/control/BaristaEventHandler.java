package org.agyei.richard.barista.events.control;

public class BaristaEventHandler {
    /*
    @Singleton
@Startup
public class BaristaEventHandler {

    private EventConsumer eventConsumer;

    @Resource
    ManagedExecutorService mes;

    @Inject
    Properties kafkaProperties;

    @Inject
    Event<CoffeeEvent> events;

    @Inject
    BaristaCommandService baristaService;

    @Inject
    Logger logger;

    public void handle(@Observes OrderAccepted event) {
        baristaService.makeCoffee(event.getOrderInfo());
    }

    @PostConstruct
    private void initConsumer() {
        kafkaProperties.put("group.id", "barista-handler");
        String orders = kafkaProperties.getProperty("orders.topic");

        eventConsumer = new EventConsumer(kafkaProperties, ev -> {
            logger.info("firing = " + ev);
            events.fire(ev);
        }, orders);

        mes.execute(eventConsumer);
    }

}
© 2019 GitHub, Inc.

     */
}
