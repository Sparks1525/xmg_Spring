package com._520it.spring.day3._02_transfer;

public interface IAccountDAO {

    void transin(Long id,Double amount);

    void transout(Long id,Double amount);

}
