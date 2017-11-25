package com.ttt.main;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.service.UserService;
import com.ttt.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 测试
 * Created by fanzhe on 2017/11/23.
 */
public class HasUserTest {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl(new UserDAOImpl(testConnation.getConf()));
        User user = new User(1,"Tom",13);
        boolean hasUser = userService.hasUser(user);
        System.out.println("hasUser: " + hasUser);
    }

}
