package com._520it.spring.day2.mvc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JdbcUtil {

    @PostConstruct
    private void init(){
        System.out.println("初始化DataSource");
    }

    public static void getConnection(){
        System.out.println("得到数据库连接");
    }

    @PreDestroy
    public void close(){
        System.out.println("DataSource关闭");
    }


}
