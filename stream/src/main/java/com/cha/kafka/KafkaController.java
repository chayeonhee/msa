package com.cha.kafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class KafkaController {
    @Autowired
    private  KafkaSender messageSender;

    

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        messageSender.sendMessage(message);
        return "Message sent to Kafka topic: " + message;
    }
    @GetMapping("/test")
    public String getString() {
        return "This is test message!!!";
    }


   
}