/**
 * <h3>miaosha</h3>
 * <p>jdk代理实现类</p>
 *
 * @author : 蒲雪冰
 * @date : 2019-08-20 11:12
 **/
package com.miaoshaproject.springaop.interfacepackage;

public class HelloWorldImpl implements Helloworld {
    @Override
    public void sysHelloWorld() {
        System.out.println("Hello world");
    }
}
