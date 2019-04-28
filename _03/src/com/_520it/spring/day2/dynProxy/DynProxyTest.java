package com._520it.spring.day2.dynProxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Proxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class DynProxyTest {

    @Autowired
    private IEmployeeService service;

    @Autowired
    private TranscationManager txManager;

    @Test
    public void testProxy(){
        //Proxy:专门用来生产代理类的对象
        //newProxyInstance需要三个参数:
        //1,ClassLoader:专门用来加载类的;
        //2,interface:需要接口,这个接口就是我们目标对象实现的接口
        IEmployeeService o = (IEmployeeService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                new Class[]{IEmployeeService.class},new TranscationInvocationHandler(service, txManager));
        o.update(new Employee());
    }
}
