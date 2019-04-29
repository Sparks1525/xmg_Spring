package com._520it.spring.day1._10_mvc;

public class JdbcUtil {

    private void init(){
        System.out.println("初始化DataSource");
    }

    public static void getConnection(){
        System.out.println("得到数据库连接");
    }


}
