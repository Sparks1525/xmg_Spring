package com._520it.spring.day3.jdbc;

import java.util.List;

public interface IEmployeeDAO {

    void save(Employee e);

    void update(Employee e);

    Employee get(Long id);

    void delete(Long id);

    List<Employee> list();

}
