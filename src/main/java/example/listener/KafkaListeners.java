package example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "kafkacode",
            groupId = "groupid"
    )
    void listener(String data) {
        System.out.println("Listener recived: " + data + " :)");
    }

}
