package com._520it.spring.day1.name;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 添加@RunWith标签;
 * 1,告诉Junit,在测试开始的时候,先启动spring容器,在测试完成之后记得关闭spring容器;
 * 2,自动的把当前这个测试类也加入到了spring容器中管理;
 */
@RunWith(SpringJUnit4ClassRunner.class)

/**
 * 告诉spring从什么地方加载配置文件,默认情况下使用相对路径查询;也可以使用classpath前缀
 * 如果在ContextConfiguration标签中不写配置文件地址,spring可以通过一个约定的方式找到配置文件;
 *      1,和测试类一个包里面;
 *      2,这个配置文件的名字叫做 测试类-context.xml
 */
@ContextConfiguration
//@ContextConfiguration(locations = "MyTest-context.xml")
public class SpringTest {

    private SomeBean someBean;

    /**
     * 使用@Autowired标签,就自动的把spring创建好的容器的引用,设置给了这个字段;
     */
    @Autowired
    private BeanFactory factory;


    /**
     * 也可以把@Autowired标签打在setXXX上
     */
//    private BeanFactory beanFactory;
//    @Autowired
//    public void setBeanFactory(BeanFactory beanFactory){
//        this.beanFactory = beanFactory;
//    }



    @Test
    public void test() {
        someBean = factory.getBean("somebean", SomeBean.class);
        someBean.print();
    }


}
