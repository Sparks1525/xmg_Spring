package com._520it.spring.day1._02_name;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Arrays;

public class NameTest {

    private SomeBean somebean;

    public NameTest(){
        // 启动Spring容器
        // 创建一个资源对象,ClassPathResource代表从Classpath下开始加载资源的对象;
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        System.out.println(Arrays.toString(factory.getAliases("somebean")));
        somebean = factory.getBean("somebean2", SomeBean.class);
    }


    public void test(){
        somebean.print();
    }


}
