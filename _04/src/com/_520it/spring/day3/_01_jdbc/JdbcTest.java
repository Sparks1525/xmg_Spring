package com._520it.spring.day3._01_jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class JdbcTest {

    @Autowired
    private IEmployeeDAO dao;

    @Test
    public void testSave() {
        Employee e = new Employee();
        e.setName("java");
        e.setPassword("java");
        dao.save(e);
    }

    @Test
    public void testGet() {
        Employee e = dao.get(1L);
        System.out.println(e);
    }

    @Test
    public void testUpdate() {
        Employee e = dao.get(1L);
        e.setName("update");
        dao.update(e);
    }

    @Test
    public void testList(){
        List<Employee> es = dao.list();
        System.out.println(es);
    }

    @Test
    public void testDelete(){
        dao.delete(1L);
    }
}
