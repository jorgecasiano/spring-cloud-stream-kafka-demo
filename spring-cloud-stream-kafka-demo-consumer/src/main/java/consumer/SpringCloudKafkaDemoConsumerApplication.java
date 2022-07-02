package consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;
import java.util.function.Function;

@Slf4j
@SpringBootApplication
public class SpringCloudKafkaDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudKafkaDemoConsumerApplication.class, args);
    }

    @Bean
    public Function<String, String> processor() {
        return message -> {
            log.info("Processing message {}", message);
            return "Processed " + message;
        };
    }

    @Bean
    public Consumer<Message<String>> consumer() {
        return message -> log.info("Received message {}", message);
    }

}
