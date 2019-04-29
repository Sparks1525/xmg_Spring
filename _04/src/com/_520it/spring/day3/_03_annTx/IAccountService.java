package com._520it.spring.day3._03_annTx;

public interface IAccountService {


    void transin(Long id, Double amount);

    void transout(Long id, Double amount);

    void transfer(Long inid, Long outid, Double amount);

}
