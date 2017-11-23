package com.ttt.dao;

import com.ttt.model.User;
import com.ttt.util.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by fanzhe on 2017/11/23.
 */
public class UserDAOImpl implements UserDAO {
    private Connection connection = null ;

    public UserDAOImpl(){
        this.connection = DBUtils.getConnection();
    }
    public UserDAOImpl(Connection connection){
        this.connection = connection;
    }
    @Override
    public boolean hasUser(User user) {
        String sql = "";
        try {
            this.connection.prepareStatement(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUserById(int id) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean getUserByName(String name) {
        return false;
    }
}
