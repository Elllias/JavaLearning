package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Moto {
    public IEngine engine; // Внедрение через конструктор
    @Autowired
    public Body body; // Внедрение через поле
    public Wheels wheels; // Внедрение через сеттер

    public Moto(@Qualifier("engine") IEngine engine) {
        this.engine = engine;
    }

    public void setWheels(Wheels wheels){
        this.wheels = wheels;
    }

    public void start(){
        System.out.println("Whiu-whiiiu-wrwrwrwrwrwrwrwr!");
    }

}
