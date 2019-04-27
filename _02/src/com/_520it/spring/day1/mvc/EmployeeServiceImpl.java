package com._520it.spring.day1.mvc;

public class EmployeeServiceImpl implements IEmployeeService{

    private IEmployeeDAO dao;

    public void setDao(IEmployeeDAO dao) {
        this.dao = dao;
    }

    @Override
    public void save(Employee e) {
        System.out.println("做一些额外的业务逻辑操作");
        dao.save(e);
    }
}
