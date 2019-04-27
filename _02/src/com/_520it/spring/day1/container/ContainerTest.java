package com._520it.spring.day1.container;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ContainerTest {

    /**
     * 其实,在使用Spring测试的时候,启动的容器都是ApplicationContext;
     * 因为ApplicationContext继承了BeanFactory,所以我们可以直接在这里注入BeanFactory
     */
    @Autowired
    private ApplicationContext ctx;


    @Test
    public void testCtx2(){
        SomeBean bean = ctx.getBean("somebean",SomeBean.class);
        bean.print();
    }


    @Test
    public void testCtx(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
          "com/_520it/spring/day1/container/ContainerTest-context.xml");
        SomeBean bean = ctx.getBean("somebean",SomeBean.class);
    }

    @Test
    public void testBf(){
        Resource resource = new ClassPathResource("com/_520it/spring/day1/container/ContainerTest-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        beanFactory.getBean("somebean");
    }

}
