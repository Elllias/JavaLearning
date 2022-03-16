package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeWork3Application {

    private static Moto moto;

    public HomeWork3Application(Moto moto){
        HomeWork3Application.moto = moto;
    }

    public static void main(String[] args) {
        SpringApplication.run(HomeWork3Application.class, args);
        moto.start();
    }

}
