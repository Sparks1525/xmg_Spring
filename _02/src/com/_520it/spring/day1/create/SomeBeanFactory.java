package com._520it.spring.day1.create;

public class SomeBeanFactory {

    public static SomeBean create(){
        SomeBean bean = new SomeBean();
        bean.init();
        return bean;
    }

}
