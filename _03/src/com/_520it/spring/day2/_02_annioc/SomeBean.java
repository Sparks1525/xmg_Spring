package com._520it.spring.day2._02_annioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

//@Component
//@Service
//@Repository//仓库
@Controller
public class SomeBean {

    @Autowired
    private OtherBean other;

    @Autowired
    private ApplicationContext ctx;

    @Override
    public String toString() {
        System.out.println(ctx);
        return "SomeBean{" +
                "other=" + other +
                '}';
    }
}
