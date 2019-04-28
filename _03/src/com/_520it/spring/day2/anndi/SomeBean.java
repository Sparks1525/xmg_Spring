package com._520it.spring.day2.anndi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class SomeBean {

//    @Autowired(required = false)
//    @Qualifier("otherbean")
    @Resource(name = "otherBean")
    private OtherBean other;

//    @Autowired
//    public void setOther(OtherBean other) {
//        this.other = other;
//    }

//    @Autowired
    private ApplicationContext ctx;

    @Override
    public String toString() {
        System.out.println(ctx);
        return "SomeBean{" +
                "other=" + other +
                '}';
    }
}
