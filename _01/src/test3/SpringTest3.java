package test3;

import bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest3 {

    private Student student_3;

    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test3/SpringTest3-context.xml");
        student_3 = ctx.getBean("student_3", Student.class);
        System.out.println("student_3:" + student_3);
    }
}
