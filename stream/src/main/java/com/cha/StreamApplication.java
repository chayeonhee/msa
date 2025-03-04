package com.cha;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.context.properties.EnableConfigurationProperties;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// import com.cha.config.ConfigProperties;

@SpringBootApplication
// @EnableDiscoveryClient
// @EnableConfigurationProperties(value = {ConfigProperties.class})
public class StreamApplication {


    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class, args);
    }

}

