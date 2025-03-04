package com.cha.kafka_rabbit;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component
public class StreamFunction {

    // Function to process Kafka message and send it to RabbitMQ
    // @Bean
    // public Function<String, String> kafkaToRabbitFunction() {
    //     return message -> {
    //         // Here you can add any logic to process the message
    //         System.out.println("Received from Kafka: " + message);

    //         // Send the processed message to RabbitMQ
    //         return message;  // Send the message as-is to RabbitMQ for now
    //     };
    // }
    @Bean
    public Function<String,String> kafkaToRabbitFunction() {
        return message -> {
           System.out.println("consumed message: "+ message);
           return message;
        };
    }


    // @Autowired
    // private StreamBridge streamBridge;

    // // Function to process Kafka message and send it to RabbitMQ
    // @ServiceActivator(inputChannel = "kafkaToRabbitFunction-in-0")
    // public void kafkaToRabbitFunction(String message) {
    //     // 메시지 처리 로직 (필요한 경우 메시지를 가공)
    //     System.out.println("Received from Kafka: " + message);

    //     // StreamBridge를 사용하여 메시지를 RabbitMQ로 보냄
    //     streamBridge.send("kafkaToRabbitFunction-out-0", message);
    // }
}
