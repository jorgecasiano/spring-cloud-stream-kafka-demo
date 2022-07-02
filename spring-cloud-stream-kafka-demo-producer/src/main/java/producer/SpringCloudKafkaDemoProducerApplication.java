package producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.util.function.Supplier;

@Slf4j
@SpringBootApplication
public class SpringCloudKafkaDemoProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudKafkaDemoProducerApplication.class, args);
    }

    @Bean
    public Supplier<String> producer() {
        return () -> "message from supplier at " + Instant.now();
    }

}
