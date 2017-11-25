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
        ResultSet rs = userService.getUserByName("Tom");
        int col = rs.getMetaData().getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= col; i++) {
                System.out.print(rs.getString(i) + "\t");
                if ((i == 2) && (rs.getString(i).length() < 8)) {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }

    }
}
