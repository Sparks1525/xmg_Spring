package com._520it.spring.day3.jdbc2;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployeeDAO {



    @Override
    public void save(Employee e) {
        this.getJdbcTemplate().update("INSERT INTO employee(name,password) VALUES(?.?)",
                e.getName(), e.getPassword());
    }

    @Override
    public void update(Employee e) {
        this.getJdbcTemplate().update("UPDATE employee SET name = ?,password = ? WHERE id = ?",
                e.getName(), e.getPassword(), e.getId());
    }

    @Override
    public Employee get(Long id) {
        Employee e = this.getJdbcTemplate().query("SELECT * FROM employee WHERE id = ?",
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
        this.getJdbcTemplate().update("DELETE FROM employee WHERE id = ?", id);
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

        List<Employee> es = this.getJdbcTemplate().query("SELECT * FROM employee", new RowMapper<Employee>() {
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
