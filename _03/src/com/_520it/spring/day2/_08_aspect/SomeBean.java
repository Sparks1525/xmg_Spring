package com._520it.spring.day2._08_aspect;

public class SomeBean {

    public Integer someMethod(Integer arg){
        System.out.println("执行some method");
        return arg + 1;
    }
}
