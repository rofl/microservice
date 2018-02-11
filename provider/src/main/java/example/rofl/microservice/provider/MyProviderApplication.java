package example.rofl.microservice.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MyProviderApplication {

    public static void main(String... args) {
        SpringApplication.run(MyProviderApplication.class, args);
    }
}
