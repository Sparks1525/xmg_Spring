package com._520it.spring.day2._08_aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyService {

    /**
     * 在方法执行之前执行
     */
    public void before(){
        System.out.println("before");
    }

    /**
     * 在方法正常执行之后
     */
    public void afterReturning(){
        System.out.println("after returning");
    }

    /**
     * 在方法执行之后
     * 在finally里面
     */
    public void after(){
        System.out.println("after");
    }

    /**
     * 在抛出异常的时候
     * 如果要得到抛出的异常
     * 1,在方法中添加有一个参数,起一个参数名字
     * 2,在<_07_aop:after-throwing中添加一个throwing属性,属性的名字就是这个方法的参数的名字
     */
    public void afterThrowing(Throwable ex){
        System.out.println("after-throwing" + ex.getMessage());
    }

    /**
     * around:环绕通知,把整个方法的执行全部包裹起来;
     *  要能够作为around的通知的方法,方法必须第一个参数是ProceedingJoinPoint;
     *  在ProceedingJoinPoint中提供了一个proceed方法,这个方法能够让方法继续向下执行(执行真实对象的方法)
     * @param pjp
     * @return
     */
    public Object around(ProceedingJoinPoint pjp){
        try{
            System.out.println("before");
            Object ret = pjp.proceed();
            System.out.println("after returning");
            return ret;
        } catch (Throwable ex){
            System.out.println("after throwing");
        } finally {
            System.out.println("after");
        }
        return null;
    }
}
