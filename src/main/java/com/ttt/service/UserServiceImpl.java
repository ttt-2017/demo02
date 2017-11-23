package com.ttt.service;

import com.ttt.dao.UserDAO;
import com.ttt.model.User;

/**
 * Created by fanzhe on 2017/11/23.
 */
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public UserServiceImpl(){}
    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }
    @Override
    public boolean hasUser(User user) {
        return this.userDAO.hasUser(user);
    }
}
