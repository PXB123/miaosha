package com.miaoshaproject.miaosha;

import com.miaoshaproject.springaop.JdkProxyExample;
import com.miaoshaproject.springaop.interfacepackage.HelloWorldImpl;
import com.miaoshaproject.springaop.interfacepackage.Helloworld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MiaoshaApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void jdkProxyTest(){
        JdkProxyExample jdkProxyExample = new JdkProxyExample();
        Helloworld proxy = (Helloworld) jdkProxyExample.bind(new HelloWorldImpl());
        proxy.sysHelloWorld();
    }
}
