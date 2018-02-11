package example.rofl.microservice.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class MyConsumer {
    private static final Logger log = LoggerFactory.getLogger(MyConsumer.class);

    @KafkaListener(topics = "myTopic")
    void on(String event) {
        log.info("Received event [{}]", event);
    }
}
