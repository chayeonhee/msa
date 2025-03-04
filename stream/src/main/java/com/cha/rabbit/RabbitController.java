package com.cha.rabbit;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    private final StreamBridge streamBridge;

    public RabbitController(StreamBridge streamBridge) {
            this.streamBridge = streamBridge;
        }

    @GetMapping("/publish")
    public String publishMessage(@RequestParam(defaultValue = "Hello World") String message) {
        System.out.println("publish message to chaExchange: "+message);
        streamBridge.send("rabbitPublisher-out-0", message);
        return "published message to demoExchange: " + message;
    }
}
