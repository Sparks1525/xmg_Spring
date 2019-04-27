package com._520it.spring.day1.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloTest {

    private IHelloWorld helloWorld;

    public HelloTest(){
        // 启动Spring容器
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        helloWorld = beanFactory.getBean("helloworld", HelloWorld.class);
    }


    public void test(){
        helloWorld.sayHello();
    }


}
