package com.cha.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {

    @Autowired
    private StreamBridge streamBridge;

    // Kafka와 RabbitMQ로 메시지를 전송하는 함수
    public void sendMessage(String message) {
        // Kafka로 메시지 전송
        System.out.println("send :"+message);
        streamBridge.send("kafka-output", message);
        // RabbitMQ로 메시지 전송
        // streamBridge.send("rabbit-output", MessageBuilder.withPayload(message).build());
    }
}

