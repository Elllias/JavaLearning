package com.example.task4.Configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Profile("test")
@Configuration
public class TestConfig {

    @PostConstruct
    private void pc(){
        System.out.println("TEST Config activated");
        System.out.println(list[0] + " " + list[1] + " " + list[2]);
        System.out.println(configValue);
    }

    private String[] list = {"test","config","activated"};

    private String name = "Lib1";

    @Value("${config.value}")
    private String configValue;

}
