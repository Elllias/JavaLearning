package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
public class RacketEngine implements IEngine {

    public RacketEngine(){}

    @Override
    public void work() {
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW!!!");
    }

    @PostConstruct
    public void postCont(){
        System.out.println("RacketEngine was BORN!!!");
    }

    @PreDestroy()
    public void preDestroy(){
        System.out.println("RacketEngine was destroyed");
    }
}
