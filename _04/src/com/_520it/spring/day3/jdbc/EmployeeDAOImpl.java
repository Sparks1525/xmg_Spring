package com._520it.spring.day3.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Employee e) {
        jdbcTemplate.update("INSERT INTO employee(name,password) VALUES(?.?)",
                e.getName(), e.getPassword());
    }

    @Override
    public void update(Employee e) {
        jdbcTemplate.update("UPDATE employee SET name = ?,password = ? WHERE id = ?",
                e.getName(), e.getPassword(), e.getId());
    }

    @Override
    public Employee get(Long id) {
        Employee e = jdbcTemplate.query("SELECT * FROM employee WHERE id = ?",
                new ResultSetExtractor<Employee>() {
                    @Override
                    public Employee extractData(ResultSet rs)
                            throws SQLException, DataAccessException {
                        if (rs.next()) {
                            Employee e = new Employee();
                            e.setName(rs.getString("name"));
                            e.setPassword(rs.getString("password"));
                            e.setId(rs.getLong("id"));
                            return e;
                        }
                        return null;
                    }
                }, id);
        return e;
    }


    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM employee WHERE id = ?", id);
    }

    @Override
    public List<Employee> list() {

//       List<Employee> es =  jdbcTemplate.query("SELECT * FROM employee",
//                new ResultSetExtractor<List<Employee>>() {
//
//                    @Override
//                    public List<Employee> extractData(ResultSet rs)
//                            throws SQLException, DataAccessException {
//                        List<Employee> es = new ArrayList<>();
//                        while (rs.next()) {
//                            Employee e = new Employee();
//                            e.setName(rs.getString("name"));
//                            e.setPassword(rs.getString("password"));
//                            e.setId(rs.getLong("id"));
//                            es.add(e);
//                        }
//                        return es;
//                    }
//                });

        List<Employee> es = jdbcTemplate.query("SELECT * FROM employee", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employee e = new Employee();
                e.setName(rs.getString("name"));
                e.setPassword(rs.getString("password"));
                e.setId(rs.getLong("id"));
                return e;
            }
        });
        return es;
    }
}
