package com._520it.spring.day1.initmethod;

import com._520it.spring.day1.scope.SomeBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class InitMethodTest {


    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testBean(){

        SomeBean bean = ctx.getBean("somebean", SomeBean.class);
        SomeBean bean2 = ctx.getBean("somebean", SomeBean.class);
        System.out.println(bean == bean2);
    }

    /**
     * 如果手动启动容器,容器在测试结束后被强行关闭
     */
    @Test
    public void testBean2(){

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/_520it/spring/day1/initmethod/InitMethodTest-context.xml");
        SomeBean bean = ctx.getBean("somebean", SomeBean.class);
        bean.print();
        ctx.close();
    }


    /**
     * registerShutdownHook,代表,在JVM的正常关闭线程中,添加一个Spring的关闭子线程;
     * 系统的守护进程
     */
    @Test
    public void testBean3(){

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/_520it/spring/day1/initmethod/InitMethodTest-context.xml");
        SomeBean bean = ctx.getBean("somebean", SomeBean.class);
        bean.print();
        ctx.registerShutdownHook();
    }
}
