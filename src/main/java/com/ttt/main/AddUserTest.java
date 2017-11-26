package com.ttt.main;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.service.UserService;
import com.ttt.service.UserServiceImpl;

public class AddUserTest {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl(new UserDAOImpl(testConnation.getConf()));
        User user = new User(4,"Tom",13);
        boolean addUser = userService.addUser(user);
        System.out.println("addUser: " + addUser);

    }
}
