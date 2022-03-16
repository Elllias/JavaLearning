package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Body {

    public Body() {}

    @PostConstruct
    public void post(){
        System.out.println("Body created!");
    }

}
