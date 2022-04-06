package com.example.task4.Configs;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;


@Configuration
@ConfigurationProperties(prefix = "prefix")
@Profile("!default")
public class Config {

    @PostConstruct
    private void PostContructForDev(){
        System.out.println(name.toUpperCase() + " Config activated");
        System.out.println(list[0] + " " + list[1] + " " + list[2]);
        System.out.println(configValue);
    }

    @Value("${prefix.list.values}")
    private String[] list;
    @Value("${prefix.name}")
    private String name;
    @Value("${prefix.config.value}")
    private String configValue;
}
