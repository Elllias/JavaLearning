package com.example.task4.configs;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConfigurationProperties(prefix = "prefix")
public class Config {

    public Config() {
    }

    @PostConstruct
    private void PostContructForDev(){
        System.out.println(name.toUpperCase() + " Config activated");
        System.out.println(list[0] + " " + list[1] + " " + list[2]);
        System.out.println(config);
    }

    private String[] list;
    private String name;
    private String config;

    public void setList(String[] list) {
        this.list = list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
