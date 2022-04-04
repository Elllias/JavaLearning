package com.example.task4;

import com.example.task4.Classes.MyClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task4Application {

    public static MyClass bean;

    Task4Application(MyClass b){
        bean = b;
    }

    public static void main(String[] args) {
        SpringApplication.run(Task4Application.class, args);


    }

}
