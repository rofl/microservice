package example.rofl.microservice.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class MyProvider {
    private static final Logger log = LoggerFactory.getLogger(MyProvider.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private int counter = 0;

    @Scheduled(fixedRate = 1000)
    public void provideSomething() {
        kafkaTemplate.send("myTopic", ""+counter);
        log.info("Sending [{}]", counter++);
    }
}
