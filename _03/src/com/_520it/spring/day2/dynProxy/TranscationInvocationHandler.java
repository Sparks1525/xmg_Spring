package com._520it.spring.day2.dynProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TranscationInvocationHandler implements InvocationHandler {

    private IEmployeeService targe;
    private TranscationManager txManager;

    public TranscationInvocationHandler(IEmployeeService service, TranscationManager txManager) {
        this.txManager = txManager;
        this.targe = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("==================================");
//        System.out.println(method);
//        System.out.println(Arrays.toString(args));

        txManager.begin();
        try{
            Object ret = method.invoke(targe, args);
            txManager.commit();
            return ret;
        } catch (Exception e){
            txManager.rollback();
        }
        return null;
    }
}
