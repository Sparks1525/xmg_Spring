package com._520it.spring.day2._08_aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AspectTest {

    @Autowired
    private SomeBean bean;

    @Test
    public void test(){
        System.out.println(bean.someMethod(1));
    }

}
