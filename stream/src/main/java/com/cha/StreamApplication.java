package com.cha;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.cha.config.ConfigProperties;
import com.cha.service.StreamService;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(value = {ConfigProperties.class})
public class StreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamApplication.class, args);
	}
	@Bean
    public CommandLineRunner demo(StreamService kafkaService) {
        return args -> {
            kafkaService.sendMessage("Hello from Spring Cloud Stream!");
        };
    }

}
