package com.cha.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import java.util.function.Consumer;
import java.util.function.Function;

@Component
public class KafkaReceiver {

    // // Kafka와 RabbitMQ에서 수신된 메시지를 처리하는 Consumer
    @Bean
    public Function<String, String> processMessage() {
        return message -> {
            System.out.println("Received message: " + message);
            return "Processed: " + message;
        };
    }

}