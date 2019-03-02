package test8;


import bean.Student;
import bean.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SpringTest8 {

    @Autowired
    public Teacher teacher_8;


    @Test
    public void test1(){
        System.out.println("teacher_8:" + teacher_8);
    }
}
