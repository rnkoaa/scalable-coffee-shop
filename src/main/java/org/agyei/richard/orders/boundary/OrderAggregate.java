package org.agyei.richard.orders.boundary;

public class OrderAggregate {
//    private EventConsumer eventConsumer;
//
//    @Resource
//    ManagedExecutorService mes;
//
//    @Inject
//    Properties kafkaProperties;
//
//    @Inject
//    Event<CoffeeEvent> events;
//
//    @Inject
//    OrderCommandService orderService;
//
//    @Inject
//    Logger logger;
//
//    public void handle(@Observes OrderBeansReserved event) {
//        orderService.acceptOrder(event.getOrderId());
//    }
//
//    public void handle(@Observes OrderFailedBeansNotAvailable event) {
//        orderService.cancelOrder(event.getOrderId(), "No beans of the origin were available");
//    }
//
//    public void handle(@Observes CoffeeBrewStarted event) {
//        orderService.startOrder(event.getOrderInfo().getOrderId());
//    }
//
//    public void handle(@Observes CoffeeBrewFinished event) {
//        orderService.finishOrder(event.getOrderId());
//    }

//    public void handle(/*@Observes*/ CoffeeDelivered event) {
////        orderService.deliverOrder(event.getOrderId());
//    }

//    @PostConstruct
    private void initConsumer() {
//        kafkaProperties.put("group.id", "order-handler");
//        String barista = kafkaProperties.getProperty("barista.topic");
//        String beans = kafkaProperties.getProperty("beans.topic");
//
//        eventConsumer = new EventConsumer(kafkaProperties, ev -> {
//            logger.info("firing = " + ev);
//            events.fire(ev);
//        }, barista, beans);
//
//        mes.execute(eventConsumer);
    }

//    @PreDestroy
//    public void closeConsumer() {
//        eventConsumer.stop();
//    }
}
