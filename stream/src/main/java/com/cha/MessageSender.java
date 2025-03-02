package com.cha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
public class MessageSender {

    @Autowired
    private StreamBridge streamBridge;

    // Kafka와 RabbitMQ로 메시지를 전송하는 함수
    public void sendMessage(String message) {
        // Kafka로 메시지 전송
        streamBridge.send("kafka-output", message);
        // RabbitMQ로 메시지 전송
        streamBridge.send("rabbit-output", message);
    }
}

