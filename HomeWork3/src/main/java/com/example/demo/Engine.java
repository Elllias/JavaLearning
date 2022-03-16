package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
public class Engine implements IEngine {

    public Engine() {}

    @PostConstruct
    public void postCont(){
        System.out.println("Engine was BORN!!!");
    }

    @PreDestroy()
    public void preDestroy(){
        System.out.println("Engine was destroyed");
    }

    @Override
    public void work() {
        System.out.println("Brum-brum-rrrr");
    }
}
