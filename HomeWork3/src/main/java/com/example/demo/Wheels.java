package com.example.demo;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component()
public class Wheels {

    public void Wheels() {}

    @PostConstruct
    public void post(){
        System.out.println("Wheels created!");
    }
}
