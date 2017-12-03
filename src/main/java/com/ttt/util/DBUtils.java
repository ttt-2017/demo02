package com.ttt.util;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.LinkedHashMap;
import java.util.Properties;

/**
 * TODO : jiahua
 * DataBase 工具类
 * Created by fanzhe on 2017/11/23.
 */
public class DBUtils {
    private static final String jdbc_properties = "jdbc.properties";
    private static Connection mysqlConn = null;
    /**
     * 获取JDBC连接
     * @return
     */
    public static Connection getConnection(){
        LinkedHashMap<String,String> properties = PropertiesUtils.getProperties(jdbc_properties);
            try{
                Class.forName(properties.get("jdbc.driver"));
                System.out.println("Connecting to database...");
                mysqlConn = DriverManager.getConnection(properties.get("jdbc.url"), properties.get("jdbc.username"), properties.get("jdbc.password"));
                System.out.println("connecting to database sucessfully");
            }catch (Exception e) {
                e.printStackTrace();
                System.out.println("can not to connecting to database");
            }
            return mysqlConn;

    }

    private static void  init(){
        // 往给定的数据库里面插入测试数据
        User user = null;
        Connection connection = null;
        UserDAOImpl userDAO = null;
        boolean flat = false;
        try {
            connection = getConnection();
            ResultSet rs = connection.getMetaData().getTables(null, null, "user", null);
            if(rs.next()){
                flat=true;
            }
        } catch (SQLException e) {
            flat=false;
        }
        if(!flat){
            String sql="create table user(id int NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "name varchar(20) NOT NULL,"+
                    "age int)";
            try {
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        for(int i=0;i<10;i++){
            userDAO = new UserDAOImpl(connection);
            user = new User();
            user.setName("zhang"+i);
            user.setAge(i);
            userDAO.addUser(user);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        init();
//       getConnection();
    }

}
