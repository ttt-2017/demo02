package com.ttt.dao;

import com.ttt.model.User;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Created by fanzhe on 2017/11/23.
 */
public interface UserDAO {
    public boolean hasUser(User user);

    public boolean addUser(User user);

    public boolean deleteUserById(int id);

    public boolean updateUser(User user);

    public ArrayList<User> getUserByName(String name);

    //public User getUserByName(String name);

}
