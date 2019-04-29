package com._520it.spring.day1._04_create;

public class SomeBeanFactory {

    public static SomeBean create(){
        SomeBean bean = new SomeBean();
        bean.init();
        return bean;
    }

}
