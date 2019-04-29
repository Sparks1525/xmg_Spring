package com._520it.spring.day2._06_cglib;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {


    @Test
    public void test(){

        SomeBean target = new SomeBean();
        // 增强器
        Enhancer enhancer = new Enhancer();
        // 设置目标对象的classLoader
        enhancer.setClassLoader(target.getClass().getClassLoader());
        // 设置这个动态代理类的父类;
        enhancer.setSuperclass(SomeBean.class);
        // 设置要传入的拦截器
        enhancer.setCallback(new LogInvocationHandler(target));
        // 使用create方法创建代理对象
        SomeBean o = (SomeBean)enhancer.create();
        o.print2();
    }

}
