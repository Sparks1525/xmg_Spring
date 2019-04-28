package com._520it.spring.day2.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AopTest {

    @Autowired
    private IEmployeeService service;

    @Autowired
    private IDepartmentService deptService;




    @Test
    public void testProxy() throws Exception{
        service.save(new Employee());
    }



}