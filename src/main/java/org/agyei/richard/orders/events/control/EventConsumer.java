package org.agyei.richard.orders.events.control;

public class EventConsumer {
}
/*
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class EventConsumer implements Runnable {

    private final KafkaConsumer<String, CoffeeEvent> consumer;
    private final Consumer<CoffeeEvent> eventConsumer;
    private final AtomicBoolean closed = new AtomicBoolean();

    public EventConsumer(Properties kafkaProperties, Consumer<CoffeeEvent> eventConsumer, String... topics) {
        this.eventConsumer = eventConsumer;
        consumer = new KafkaConsumer<>(kafkaProperties);
        consumer.subscribe(asList(topics));
    }

    @Override
    public void run() {
        try {
            while (!closed.get()) {
                consume();
            }
        } catch (WakeupException e) {
            // will wakeup for closing
        } finally {
            consumer.close();
        }
    }

    private void consume() {
        ConsumerRecords<String, CoffeeEvent> records = consumer.poll(Long.MAX_VALUE);
        for (ConsumerRecord<String, CoffeeEvent> record : records) {
            eventConsumer.accept(record.value());
        }
        consumer.commitSync();
    }

    public void stop() {
        closed.set(true);
        consumer.wakeup();
    }

}
 */
