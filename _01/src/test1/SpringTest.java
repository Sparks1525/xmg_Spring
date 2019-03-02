package test1;

import bean.Student;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Arrays;

@SuppressWarnings("all")
public class SpringTest {

    private Student student;

    @Test
    public void test1(){
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        System.out.println(Arrays.toString(factory.getAliases("student_1")));
        student = factory.getBean("student_1",Student.class);
        System.out.println("student_1:" + student);
    }
}
