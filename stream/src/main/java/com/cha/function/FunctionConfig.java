package com.cha.function;

import org.springframework.cloud.function.context.FunctionRegistration;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
//Kafka에서 메시지를 수신하고 처리하는 로직을 담당합니다.
public class FunctionConfig {

    @Bean
    public Function<String, String> processMessage() {
        return message -> {
            // Kafka에서 수신한 메시지를 처리하는 로직
            System.out.println("Received message: " + message);
            // 메시지를 변환하여 반환
            return "Processed: " + message;
        };
    }
}