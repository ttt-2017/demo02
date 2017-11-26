package com.ttt.service;

import com.ttt.model.User;

import java.sql.ResultSet;

/**
 * Created by fanzhe on 2017/11/23.
 */
public interface UserService {
    public boolean hasUser(User user);

    public boolean addUser(User user);

    public boolean deleteUserById(int id);

    public boolean updateUser(User user);

    public ResultSet getUserByName(String name);

   // public User getUserByName(String name);
}
