package com._520it.spring.day1.initmethod;

public class SomeBean {

    public void init(){
        System.out.println("init somebean");
    }

    public void close(){
        System.out.println("close somebean");
    }

    public void print(){
        System.out.println("container");
    }

}
