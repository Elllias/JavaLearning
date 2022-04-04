package com.example.task4.Configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("prod")
@Configuration
public class ProdConfig {

    @PostConstruct
    private void pc(){
        System.out.println("PROD Config activated");
        System.out.println(list[0] + " " + list[1] + " " + list[2]);
        System.out.println(configValue);
    }

    private String[] list = {"prod","config","activated"};

    private String name = "Lib1";

    @Value("${config.value}")
    private String configValue;
}
