package com._520it.spring.day3._02_transfer;

public interface IAccountService {


    void transin(Long id,Double amount);

    void transout(Long id,Double amount);

    void transfer(Long inid, Long outid, Double amount);

}
