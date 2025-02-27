package com.cha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
private final KafkaProducerService kafkaProducerService;

    @Autowired
    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaProducerService.sendMessage("cha-topic", message);
        return "Message sent to Kafka topic: " + message;
    }


    // @Autowired
    // private KafkaTemplate<String, String> kafkaTemplate;

    // private final String TOPIC = "cha_topic";

    // @GetMapping("/send")
    // public String sendMessage(String message) {
    //     kafkaTemplate.send(TOPIC, message);
    //     return "Message sent to Kafka!";
    // }

   
}