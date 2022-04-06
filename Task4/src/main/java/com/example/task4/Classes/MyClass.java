package com.example.task4.Classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class MyClass {

    MyClass(){}

    @Bean
    @ConditionalOnProperty(prefix = "prefix", name = "config.value", havingValue = "testValue")
    private void a(){
        System.out.println("config.value = testValue!!");
    }

    @Bean
    @ConditionalOnBean(name = "a")
    private void b(){
        System.out.println("То, что написано выше - чистая правда...");
    }

    @Bean
    @ConditionalOnExpression("!'${config.value}'.equals('default')")
    private void с(){
        System.out.println("Мы в не дефолтном бине, если что..");
    }
}
