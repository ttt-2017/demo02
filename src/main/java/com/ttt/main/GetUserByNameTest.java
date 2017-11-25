package com.ttt.main;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.service.UserService;
import com.ttt.service.UserServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetUserByNameTest {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl(new UserDAOImpl(testConnation.getConf()));
        User user = userService.getUserByName("Tom");
        System.out.println("user : Id\t"+user.getId()+"|\tName"+"\t"+user.getName()+"|\tAge"+user.getAge());

    }
}
