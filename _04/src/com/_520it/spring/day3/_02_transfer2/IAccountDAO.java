package com._520it.spring.day3._02_transfer2;

public interface IAccountDAO {

    void transin(Long id, Double amount);

    void transout(Long id, Double amount);

}
