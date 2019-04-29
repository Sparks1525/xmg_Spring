package com._520it.spring.day2._04_staticProxy;

public class EmployeeServiceImpl implements IEmployeeService{
    @Override
    public void save(Employee e) {
        System.out.println("dao.save(e);");
    }

    @Override
    public void update(Employee e) {
        System.out.println("dao.update(e);");
    }
}
