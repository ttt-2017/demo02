package com.ttt.main;

import com.ttt.dao.UserDAOImpl;
import com.ttt.model.User;
import com.ttt.service.UserService;
import com.ttt.service.UserServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetUserByNameTest {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl(new UserDAOImpl(testConnation.getConf()));
       // User user = userService.getUserByName("Rich");
        ArrayList<User> user_list=userService.getUserByName("Tom");
        if(user_list.size()>0){
        for(User user:user_list) {
            System.out.println("user : Id\t"+user.getId()+"|\tName" + "\t" + user.getName() + "|\tAge" + user.getAge());
        }
        }
        else {
            System.out.println("该用户不存在");
        }
    }
}
