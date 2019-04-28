package com._520it.spring.day2.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
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
