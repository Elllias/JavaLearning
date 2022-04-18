package com.example.task4.classes;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

    MyClass(){}

    @Bean
    @Profile("test")
    private void a(){
        System.out.println("config.value = testValue!!");
    }

    @Bean
    @ConditionalOnBean(name = "a")
    private void b(){
        System.out.println("То, что написано выше - чистая правда...");
    }

    @Bean
    @ConditionalOnExpression("!'default'.equals(environment['prefix.config'])")
    private void с(){
        System.out.println("Мы в не дефолтном бине, если что..");
    }
}
