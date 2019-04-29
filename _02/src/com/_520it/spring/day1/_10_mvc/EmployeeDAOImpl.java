package com._520it.spring.day1._10_mvc;

public class EmployeeDAOImpl implements IEmployeeDAO{

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
