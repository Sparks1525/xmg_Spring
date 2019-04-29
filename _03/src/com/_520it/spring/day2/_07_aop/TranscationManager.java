package com._520it.spring.day2._07_aop;

public class TranscationManager {

    public void begin(){
        System.out.println("session.getTranscation().begin()");
    }

    public void commit(){
        System.out.println("session.getTranscation().commit()");
    }

    public void rollback(){
        System.out.println("session.getTranscation().rollback()");
    }

}
