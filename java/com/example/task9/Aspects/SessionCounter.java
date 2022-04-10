package com.example.task9.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@Aspect
public class SessionCounter {

    @Value("${search.count}")
    private Integer maxNumberSessions;

    private Integer currentNumberSessions = 0;

    @Before("@annotation(com.example.task9.Annotation.TargetAnnotation)")
    public void counter() throws Throwable {

        currentNumberSessions++;

        if(currentNumberSessions >= maxNumberSessions + 1)
            throw new Throwable("Превышено колличество подключенных сессий!");

        log.info("Использовано {} сессий из {}...", currentNumberSessions, maxNumberSessions);
    }
}
