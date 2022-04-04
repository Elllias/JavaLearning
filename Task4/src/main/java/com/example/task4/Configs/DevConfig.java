package com.example.task4.Configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("dev")
@Configuration
public class DevConfig {

    @PostConstruct
    private void pc(){
        System.out.println("DEV Config activated");
        System.out.println(list[0] + " " + list[1] + " " + list[2]);
        System.out.println(configValue);
    }

    private String[] list = {"dev","config","activated"};

    private String name = "Lib1";

    @Value("${config.value}")
    private String configValue;
}
