package com._520it.spring.day2._01_anndi;

import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class SomeBean {

//    @Autowired(required = false)
//    @Qualifier("otherbean")

//    @Autowired
//    @Qualifier("bean的名字")
//    按名称装配Bean,与@Autowired组合使用，解决按类型匹配找到多个Bean问题。
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
