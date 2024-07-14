package com.arya.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
@Slf4j
public class AryaAopConfig {

    @Around(value = "com.arya.aop.AryaAopConfig.annotationTrackTimePointcut()")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Long startTime=System.currentTimeMillis();
        Object response = proceedingJoinPoint.proceed();
        Long endTime=System.currentTimeMillis();
        log.info("method {} time {} ms",proceedingJoinPoint.getSignature(),(endTime-startTime));
        return response;
    }

    @Pointcut("@annotation(com.arya.aop.TrackTimeAop)")
    public void annotationTrackTimePointcut(){

    }
}
