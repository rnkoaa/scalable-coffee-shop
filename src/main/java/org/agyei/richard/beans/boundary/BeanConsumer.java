package org.agyei.richard.beans.boundary;

public class BeanConsumer {
    /*

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
        kafkaProperties.put("group.id", "beans-consumer-" + UUID.randomUUID());
        String beans = kafkaProperties.getProperty("beans.topic");

        eventConsumer = new EventConsumer(kafkaProperties, ev -> {
            logger.info("firing = " + ev);
            events.fire(ev);
        }, beans);

        mes.execute(eventConsumer);
    }

    @PreDestroy
    public void close() {
        eventConsumer.stop();
    }

     */
}
