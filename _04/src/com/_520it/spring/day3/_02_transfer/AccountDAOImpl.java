package com._520it.spring.day3._02_transfer;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDAOImpl extends JdbcDaoSupport implements IAccountDAO {
    @Override
    public void transin(Long id, Double amount) {
        this.getJdbcTemplate()
                .update("UPDATE accout SET balance=balance+? where id=?",
                        amount, id);
    }

    @Override
    public void transout(Long id, Double amount) {
        this.getJdbcTemplate()
                .update("UPDATE accout SET balance=balance-? where id=?",
                        amount, id);
    }
}
