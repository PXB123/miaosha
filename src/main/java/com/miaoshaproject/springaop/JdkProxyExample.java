/**
 * <h3>miaosha</h3>
 * <p>代理类</p>
 *
 * @author : 蒲雪冰
 * @date : 2019-08-20 11:14
 **/
package com.miaoshaproject.springaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {
    private Object target = null;

    public  Object bind(Object target){
        this.target = target;
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        return o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理方法");
        System.out.println("这是调用方法前的服务");
        Object invoke = method.invoke(target, args);
        System.out.println("方法结束");
        return invoke;
    }
}
