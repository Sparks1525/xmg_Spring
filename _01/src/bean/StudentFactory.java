package bean;

public class StudentFactory {


    public static Student create(){
        Student student = new Student();
        student.init();
        return student;
    }


    public Student create2(){
        Student student = new Student();
        student.init();
        return student;
    }
}
