package com.ttt.util;

import java.sql.Connection;

/**
 * TODO : jiahua
 * DataBase 工具类
 * Created by fanzhe on 2017/11/23.
 */
public class DBUtils {
    private static final String jdbc_properties = "jdbc.properties";

    /**
     * 获取JDBC连接
     * @return
     */
    public static Connection getConnection(){
        // TODO
        return null ;
    }

    private static void  init(){
        // 往给定的数据库里面插入测试数据

    }
    public static void main(String[] args){
        init();
    }
}
