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
       // User user = userService.getUserByName("Rich");
        ResultSet rs=userService.getUserByName("Tom");
        System.out.println("user : Id\t"+rs.getInt("id")+"|\tName"+"\t"+rs.getString("name")+"|\tAge"+rs.getInt("age"));

    }
}
