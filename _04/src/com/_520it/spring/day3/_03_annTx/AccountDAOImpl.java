package com._520it.spring.day3._03_annTx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class AccountDAOImpl implements IAccountDAO {



    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void transin(Long id, Double amount) {
        jdbcTemplate
                .update("UPDATE accout SET balance=balance+? where id=?",
                        amount, id);
    }

    @Override
    public void transout(Long id, Double amount) {
        jdbcTemplate
                .update("UPDATE accout SET balance=balance-? where id=?",
                        amount, id);
    }
}
