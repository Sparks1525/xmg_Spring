package com._520it.spring.day3.transfer2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class TxTest {

    @Autowired
    private IAccountService service;

    @Test
    public void testTransfer(){
        service.transfer(222L, 111L,1000D);
    }


}
