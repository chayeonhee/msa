package com.cha;
import org.springframework.stereotype.Component;
import java.util.function.Consumer;
import java.util.function.Function;

@Component
public class MessageReceiver {

    // Kafka와 RabbitMQ에서 수신된 메시지를 처리하는 Consumer
    // public Consumer<String> processMessage() {
    //     return message -> {
    //         // 수신된 메시지 처리
    //         System.out.println("Received message: " + message);
    //         // 메시지 처리 로직을 추가할 수 있습니다.
    //     };
    // }

    public Function<String, String> processMessage() {
        return message -> {
            // 받은 메시지를 처리 (예: 대문자로 변환)
            System.out.println("Received message: " + message);
            return "Processed: " + message; // 변환 후 반환
        };
    }
}