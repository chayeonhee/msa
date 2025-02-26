package com.cha.service;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class StreamService {

    private final StreamBridge streamBridge;

    public StreamService(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    // 메시지를 Kafka로 송신
    public void sendMessage(String message) {
        // Kafka의 outputTopic으로 메시지 전송
        streamBridge.send("output", message);
    }

    // Kafka에서 메시지를 수신
    public String receiveMessage() {
        // 이 함수는 실제로 Kafka 메시지 수신을 처리하는 Cloud Function에서 호출되어야 합니다.
        // 여기서는 단순화하여 메시지를 처리하는 로직만 포함합니다.
        return "Received message from Kafka";
    }
}