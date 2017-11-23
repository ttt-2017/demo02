package com.ttt.dao;

import com.ttt.model.User;

/**
 * Created by fanzhe on 2017/11/23.
 */
public interface UserDAO {
    public boolean hasUser(User user);

    public boolean addUser(User user);

    public boolean deleteUserById(int id);

    public boolean updateUser(User user);

    public boolean getUserByName(String name);

}
