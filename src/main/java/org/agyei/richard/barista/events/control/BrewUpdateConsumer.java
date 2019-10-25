package org.agyei.richard.barista.events.control;

public class BrewUpdateConsumer {
    /*
    public class BaristaUpdateConsumer {

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
        kafkaProperties.put("group.id", "barista-consumer-" + UUID.randomUUID());
        String barista = kafkaProperties.getProperty("barista.topic");

        eventConsumer = new EventConsumer(kafkaProperties, ev -> {
            logger.info("firing = " + ev);
            events.fire(ev);
        }, barista);

        mes.execute(eventConsumer);
    }

    @PreDestroy
    public void close() {
        eventConsumer.stop();
    }

}
© 2019 GitHub, Inc.
     */
}
