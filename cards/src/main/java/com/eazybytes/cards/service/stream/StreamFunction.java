package com.eazybytes.cards.service.stream;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
public class StreamFunction {

    // Function to process Kafka message and send it to RabbitMQ
    @Bean
    public Function<String,String> kafkaToRabbitFunction() {
        return message -> {
           System.out.println("consumed message: "+ message);
           return message;
        };
    }


}
