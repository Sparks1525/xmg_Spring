package com._520it.spring.day3._03_annTx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO dao;

    public void setDao(IAccountDAO dao){
        this.dao = dao;
    }


    @Override
//    @Transactional(readOnly = true)
    public void transin(Long id, Double amount) {
        dao.transin(id, amount);
    }

    @Override
//    @Transactional
    public void transout(Long id, Double amount) {
        dao.transout(id, amount);
    }

    @Override
//    @Transactional
    public void transfer(Long inid, Long outid, Double amount) {
        dao.transin(inid, amount);
        dao.transout(outid, amount);
    }
}
