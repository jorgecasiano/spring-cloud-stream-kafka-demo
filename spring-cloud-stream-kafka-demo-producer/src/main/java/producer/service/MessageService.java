package producer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageService {

    private static final String BINDING_TOPIC = "producer-out-0";

    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(String message) {
      log.info("Sending message from service: {}", message);
      streamBridge.send(BINDING_TOPIC, "message from service "+message);
    }

}
