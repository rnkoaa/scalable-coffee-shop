package org.agyei.richard.beans.control;

public class BeanEventHandler {
    /*
    @Singleton
@Startup
public class BeanEventHandler {

    private EventConsumer eventConsumer;

    @Resource
    ManagedExecutorService mes;

    @Inject
    Properties kafkaProperties;

    @Inject
    Event<CoffeeEvent> events;

    @Inject
    BeanCommandService beanService;

    @Inject
    Logger logger;

    public void handle(@Observes OrderPlaced event) {
        beanService.reserveBeans(event.getOrderInfo().getBeanOrigin(), event.getOrderInfo().getOrderId());
    }

    @PostConstruct
    private void initConsumer() {
        kafkaProperties.put("group.id", "beans-handler");
        String orders = kafkaProperties.getProperty("orders.topic");
        String barista = kafkaProperties.getProperty("barista.topic");

        eventConsumer = new EventConsumer(kafkaProperties, ev -> {
            logger.info("firing = " + ev);
            events.fire(ev);
        }, orders, barista);

        mes.execute(eventConsumer);
    }

    @PreDestroy
    public void closeConsumer() {
        eventConsumer.stop();
    }

}
     */
}
