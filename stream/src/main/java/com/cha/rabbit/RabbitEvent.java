package com.cha.rabbit;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class RabbitEvent {


    @Bean
    public Function<String,String> rabbitHandler() {
        return message -> {
           System.out.println("consumed message: "+ message);
           return message;
        };
    }
}
