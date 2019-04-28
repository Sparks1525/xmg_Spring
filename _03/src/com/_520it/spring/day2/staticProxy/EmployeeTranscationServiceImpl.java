package com._520it.spring.day2.staticProxy;

public class EmployeeTranscationServiceImpl implements IEmployeeService {

    private IEmployeeService target;


    public EmployeeTranscationServiceImpl(IEmployeeService service){
        this.target = service;
    }


    @Override
    public void save(Employee e) {
        System.out.println("sessionFactory.getCurrentSession()");
        System.out.println("session.getTranscation().begin()");
        target.save(e);
        System.out.println("session.getTranscation().commit()");
    }

    @Override
    public void update(Employee e) {
        System.out.println("sessionFactory.getCurrentSession()");
        System.out.println("session.getTranscation().begin()");
        target.update(e);
        System.out.println("session.getTranscation().commit()");
    }
}
