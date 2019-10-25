package org.agyei.richard.orders.control;

public class OrderUpdateConsumer {
}
/*

@Startup
@Singleton
public class OrderUpdateConsumer {

    private EventConsumer eventConsumer;

    @Resource
    ManagedExecutorService mes;

    @Inject
    Properties kafkaProperties;

    @Inject
    Event<CoffeeEvent> events;

    @Inject
    Logger logger;

    @PostConstruct
    private void init() {
        kafkaProperties.put("group.id", "order-consumer-" + UUID.randomUUID());
        String orders = kafkaProperties.getProperty("orders.topic");

        eventConsumer = new EventConsumer(kafkaProperties, ev -> {
            logger.info("firing = " + ev);
            events.fire(ev);
        }, orders);

        mes.execute(eventConsumer);
    }

    @PreDestroy
    public void close() {
        eventConsumer.stop();
    }

}
 */