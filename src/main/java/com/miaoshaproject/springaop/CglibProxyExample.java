/**
 * <h3>miaosha</h3>
 * <p>cglib代理类</p>
 *
 * @author : 蒲雪冰
 * @date : 2019-08-20 11:29
 **/
package com.miaoshaproject.springaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyExample implements MethodInterceptor {

    public Object getProxy(Class cls){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback((Callback) this);
        return enhancer.create();
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法调用前-------");

        return null;
    }
}
