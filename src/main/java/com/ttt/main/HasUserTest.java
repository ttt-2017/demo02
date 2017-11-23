package com.ttt.main;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.service.UserService;
import com.ttt.service.UserServiceImpl;

/**
 * 测试
 * Created by fanzhe on 2017/11/23.
 */
public class HasUserTest {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl(new UserDAOImpl());
        boolean hasUser = userService.hasUser(new User());
        System.out.println("hasUser: " + hasUser);
    }
}
