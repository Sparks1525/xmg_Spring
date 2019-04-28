package com._520it.spring.day3.transfer2;

public interface IAccountDAO {

    void transin(Long id, Double amount);

    void transout(Long id, Double amount);

}
