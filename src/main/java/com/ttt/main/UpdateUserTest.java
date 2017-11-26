package com.ttt.main;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.service.UserService;
import com.ttt.service.UserServiceImpl;
public class UpdateUserTest {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl(new UserDAOImpl(testConnation.getConf()));
        User user = new User(1,"Tom",14);
        boolean updateUser = userService.updateUser(user);
        System.out.println("hasUser: " + updateUser);
    }
}