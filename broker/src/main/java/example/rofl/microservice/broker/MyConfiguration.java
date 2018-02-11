package example.rofl.microservice.broker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.test.rule.KafkaEmbedded;

@Configuration
public class MyConfiguration {

    @Bean
    KafkaEmbedded kafka() {
        KafkaEmbedded kafkaEmbedded = new KafkaEmbedded(1);
        kafkaEmbedded.setKafkaPorts(9092);
        return kafkaEmbedded;
    }
}
