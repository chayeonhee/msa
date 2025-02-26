package com.cha.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.Getter;

// @ConfigurationPropertiesBinding
@Getter
@RefreshScope
@ConfigurationProperties(prefix="stream")
public class ConfigProperties {
    private String message;

}
