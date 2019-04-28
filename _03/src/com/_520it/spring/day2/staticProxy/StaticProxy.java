package com._520it.spring.day2.staticProxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class StaticProxy {

    @Autowired
    @Qualifier("employeeService")
    private IEmployeeService service;

    @Test
    public void testSave(){
        service.save(new Employee());
    }


}
