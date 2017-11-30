package com.ttt.service;

import com.ttt.dao.UserDAO;
import com.ttt.model.User;

import java.util.List;

/**
 * Created by fanzhe on 2017/11/23.
 */
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean hasUser(User user) {
        return this.userDAO.hasUser(user);
    }

    public boolean addUser(User user) {
        return this.userDAO.addUser(user);
    }

    @Override
    public boolean deleteUserById(int id) {
        return this.userDAO.deleteUserById(id);
    }

    @Override
    public boolean deleteUserByName(String name) { return this.userDAO.deleteUserByName(name); }

    @Override
    public boolean updateUser(User user) {
        return this.userDAO.updateUser(user);
    }

    @Override
   public List<User> getUserByName(String name) {
        return this.userDAO.getUserByName(name);
}

    @Override
    public User getUserById(int id) { return this.userDAO.getUserById(id); }

    @Override
    public List<User> getUserByAge(int age,int age1) { return this.userDAO.getUserByAge(age,age1); }

}
