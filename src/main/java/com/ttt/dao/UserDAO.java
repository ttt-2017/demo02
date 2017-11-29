package com.ttt.dao;

import com.ttt.model.User;

import java.util.List;

/**
 * Created by fanzhe on 2017/11/23.
 */
public interface UserDAO {
    public boolean hasUser(User user);

    public boolean addUser(User user);

    public boolean deleteUserById(int id);

    public boolean deleteUserByName(String name);

    public boolean updateUser(User user);

    public List<User> getUserByName(String name);

    public User getUserById(int id);

    public List<User> getUserByAge(int age,int age1);
}
