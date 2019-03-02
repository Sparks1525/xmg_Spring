package test5;

import bean.Student;
import bean.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@SuppressWarnings("all")
public class SpringTest5 {

    @Autowired
    private Student student_5;

    @Autowired
    private Teacher teacher_6;

    @Test
    public void test1(){
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
    }

    @Test
    public void test2(){
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        System.out.println(Arrays.toString(factory.getAliases("student_1")));
        student_5 = factory.getBean("student_5",Student.class);
        System.out.println("student_5:" + student_5);
    }


    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test5/SpringTest5-context.xml");
    }

    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test5/SpringTest5-context.xml");
        teacher_6 = ctx.getBean("teacher_6", Teacher.class);
        System.out.println("teacher_6:" + teacher_6);
    }



}
