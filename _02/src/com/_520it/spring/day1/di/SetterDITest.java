package com._520it.spring.day1.di;

import com._520it.spring.day1.scope.SomeBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SetterDITest {


    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testBean(){

        com._520it.spring.day1.scope.SomeBean bean = ctx.getBean("somebean", com._520it.spring.day1.scope.SomeBean.class);
        System.out.println(bean);
    }


}
