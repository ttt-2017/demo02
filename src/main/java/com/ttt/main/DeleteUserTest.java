package com.ttt.main;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.service.UserService;
import com.ttt.service.UserServiceImpl;

public class DeleteUserTest {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl(new UserDAOImpl(testConnation.getConf()));
        //User user = new User(4,"AUTO_INCREMENT",13);
        boolean deleteUser = userService.deleteUserByName("AUTO_INCREMENT");
        System.out.println("deleteUser: " + deleteUser);
        
    }
}
