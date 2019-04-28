package com._520it.spring.day2.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO{

    @Autowired
    private JdbcUtil jdbcUtil;

    public void setJdbcUtil(JdbcUtil jdbcUtil){
        this.jdbcUtil = jdbcUtil;
    }

    @Override
    public void save(Employee e) {
        JdbcUtil.getConnection();
        System.out.println("INSERT INTO EMPLOYEE VALUES ()");
    }
}
