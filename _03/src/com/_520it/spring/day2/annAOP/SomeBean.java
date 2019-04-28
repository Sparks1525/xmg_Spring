package com._520it.spring.day2.annAOP;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    public Integer someMethod(Integer arg){
        System.out.println("执行some method");
        return arg + 1;
    }
}
