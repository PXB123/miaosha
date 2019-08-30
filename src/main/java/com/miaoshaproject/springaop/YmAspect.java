/**
 * <h3>miaosha</h3>
 * <p>aop练习类</p>
 *
 * @author : 蒲雪冰
 * @date : 2019-08-20 08:45
 **/
package com.miaoshaproject.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

@Aspect
@Component
public class YmAspect {
    @Pointcut("execution(public * com.miaoshaproject.service.*.*(..))")// the pointcut expression
    private void anyOldTransfer() {

    }



    @Before("com.miaoshaproject.springaop.YmAspect.anyOldTransfer()")
    public void before(){
        System.out.println("brfore");
    }

    @After("com.miaoshaproject.springaop.YmAspect.anyOldTransfer()")
    public void after(){
        System.out.println("after");
    }

    @Around("com.miaoshaproject.springaop.YmAspect.anyOldTransfer()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        long current = System.currentTimeMillis();
        Object proceed = null;
        try {
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("消耗时间："+(end-current));
        return  proceed;

    }
}
