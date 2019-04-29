package com._520it.spring.day3._02_transfer2;

public class AccountServiceImpl implements IAccountService {

    private IAccountDAO dao;

    public void setDao(IAccountDAO dao){
        this.dao = dao;
    }

    @Override
    public void transin(Long id, Double amount) {
        dao.transin(id, amount);
    }

    @Override
    public void transout(Long id, Double amount) {
        dao.transout(id, amount);
    }

    @Override
    public void transfer(Long inid, Long outid, Double amount) {
        dao.transin(inid, amount);
        dao.transout(outid, amount);
    }
}
