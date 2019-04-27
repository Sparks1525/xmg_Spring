package com._520it.spring.day1.conDi;

public class SomeBean {

    private String name;
    private long maxConnection;
    private OtherBean other;

    public SomeBean(Integer name, OtherBean other) {
        this("hahaha",name,other);
        System.out.println("==========c==============");
    }

    public SomeBean(String name, OtherBean other) {
        this(name,1111,other);
        System.out.println("==========c==============");
    }

    public SomeBean(String name, long maxConnection, OtherBean other) {
        super();
        System.out.println("==========c1==============");
        this.name = name;
        this.maxConnection = maxConnection;
        this.other = other;
    }
}
