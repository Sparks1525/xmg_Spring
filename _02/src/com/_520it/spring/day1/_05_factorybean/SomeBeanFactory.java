package com._520it.spring.day1._05_factorybean;

import org.springframework.beans.factory.FactoryBean;

public class SomeBeanFactory implements FactoryBean<SomeBean> {

    /**
     * 工厂创建bean的方法;
     */
    @Override
    public SomeBean getObject() throws Exception {
        System.out.println("工厂生产bean============");
        SomeBean bean = new SomeBean();
        bean.init();
        return bean;
    }

    /**
     * 方法返回工厂生产出来的对象的类型
     */
    @Override
    public Class<?> getObjectType() {
        return SomeBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
