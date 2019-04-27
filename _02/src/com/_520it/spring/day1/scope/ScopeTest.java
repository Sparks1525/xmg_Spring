package com._520it.spring.day1.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ScopeTest {


    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testBean(){

        SomeBean bean = ctx.getBean("somebean", SomeBean.class);
        SomeBean bean2 = ctx.getBean("somebean", SomeBean.class);
        System.out.println(bean == bean2);
    }


}
