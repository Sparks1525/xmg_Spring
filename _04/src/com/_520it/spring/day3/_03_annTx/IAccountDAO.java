package com._520it.spring.day3._03_annTx;

public interface IAccountDAO {

    void transin(Long id, Double amount);

    void transout(Long id, Double amount);

}
