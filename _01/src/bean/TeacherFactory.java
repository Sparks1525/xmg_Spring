package bean;

import org.springframework.beans.factory.FactoryBean;

public class TeacherFactory implements FactoryBean<Teacher> {

    @Override
    public Teacher getObject() throws Exception {
        System.out.println("工厂生产bean------");
        Teacher teacher = new Teacher();
        teacher.init();
        return teacher;
    }

    @Override
    public Class<?> getObjectType() {
        return Teacher.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
