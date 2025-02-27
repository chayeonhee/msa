package com.cha;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "cha-topic", groupId = "cha-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}