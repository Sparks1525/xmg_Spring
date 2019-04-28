package com._520it.spring.day2.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class MvcTest {

//    @Autowired
//    private EmployeeAction action;
//
//    @Test
//    public void test(){
//        action.save();
//    }

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void test(){
        EmployeeAction action = ctx.getBean("employeeAction",EmployeeAction.class);
        EmployeeAction action2 = ctx.getBean("employeeAction",EmployeeAction.class);
        System.out.println(action == action2);

    }
}
