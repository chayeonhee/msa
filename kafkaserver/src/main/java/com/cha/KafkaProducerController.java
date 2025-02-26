package com.cha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC = "info_topic";

    @GetMapping("/send")
    public String sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Message sent to Kafka!";
    }
}