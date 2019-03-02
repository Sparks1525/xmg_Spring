package test9;


import bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SpringTest9 {

    @Autowired
    public Student student_1;

    @Autowired
    public Student student_2;


    @Test
    public void test1(){
        System.out.println("student_1:" + student_1);

        System.out.println("-----------------------------");

        System.out.println("student_2:" + student_2);
    }
}
