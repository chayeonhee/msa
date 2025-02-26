package com.cha.controller;

import com.cha.service.StreamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stream")
public class StreamController {

    @Autowired
    private  StreamService streamService;

    public StreamController(StreamService streamService) {
        this.streamService = streamService;
    }

    // Kafka로 메시지를 보내는 엔드포인트
    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        streamService.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }

    // Kafka에서 메시지를 수신하는 엔드포인트
    @GetMapping("/receive")
    public String receiveMessage() {
        return streamService.receiveMessage();
    }

}