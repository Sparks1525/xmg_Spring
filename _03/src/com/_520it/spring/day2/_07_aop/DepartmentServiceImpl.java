package com._520it.spring.day2._07_aop;

public class DepartmentServiceImpl implements IDepartmentService {
    @Override
    public void save(Department d) {
        System.out.println("保存Department");
    }

    @Override
    public void update(Department d) {
        System.out.println("dao.update(Department)");
    }
}
