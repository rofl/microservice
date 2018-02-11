package example.rofl.microservice.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MyConsumerApplication {

    public static void main(String... args) {
        SpringApplication.run(MyConsumerApplication.class, args);
    }
}
