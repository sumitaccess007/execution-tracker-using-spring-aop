package com.sumitaccess007.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
public class LoggingAspect {
    @Around("execution (* com.sumitaccess007.services.*.*(..))")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("Method will execute");
        proceedingJoinPoint.proceed();
        log.info("Method executed");
    }
}
