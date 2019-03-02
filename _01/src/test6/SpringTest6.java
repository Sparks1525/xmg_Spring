package test6;

import bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest6 {

    @Autowired
    private Student student_6;

    @Test
    public void test1(){
        System.out.println("student_6:" + student_6);
    }
}
