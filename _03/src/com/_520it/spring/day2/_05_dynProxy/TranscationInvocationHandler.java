package com._520it.spring.day2._05_dynProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TranscationInvocationHandler implements InvocationHandler {

//    private IEmployeeService target;
    private Object target;
    private TranscationManager txManager;

//    public TranscationInvocationHandler(IEmployeeService service, TranscationManager txManager) {
//        this.txManager = txManager;
//        this.target = service;
//    }

    public TranscationInvocationHandler(Object target, TranscationManager txManager) {
        this.txManager = txManager;
        this.target = target;
    }

    /**
     *  参数:
     *  1,proxy:代理出来的对象;
     *  2,method:这次调用的方法;
     *  3,args:这次调用方法传入的参数;
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("==================================");
//        System.out.println(method);
//        System.out.println(Arrays.toString(args));

        txManager.begin();
        try{
            Object ret = method.invoke(target, args);
            txManager.commit();
            return ret;
        } catch (Exception e){
            txManager.rollback();
        }
        return null;
    }
}
