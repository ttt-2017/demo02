package com.ttt.dao;

import com.ttt.model.User;
import com.ttt.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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

    /**
     *
     * @param user
     * @return boolean
     */
    @Override
    public boolean hasUser(User user) {
        boolean flag=false;
        String sql = "select * from user where id=? and name=? and age=?";
        PreparedStatement pstmt=null;
        try {
            pstmt=this.connection.prepareStatement(sql);
            pstmt.setInt(1, user.getId());
            pstmt.setString(2,user.getName());
            pstmt.setInt(3,user.getAge());
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                flag=true;
            }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     *
     * @param user
     * @return boolean
     */
    @Override
    public boolean addUser(User user) {
        String sql = "insert into user (name,age) values(?,?)";
        PreparedStatement pstmt=null;
        Boolean i = false;
        try {
            pstmt =connection.prepareStatement(sql);
            pstmt.setString(1, user.getName());
            pstmt.setInt(2, user.getAge());
            i = pstmt.executeUpdate()==1;
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     *
     * @param id
     * @return boolean
     */
    @Override
    public boolean deleteUserById(int id) {
        String sql = "delete from user where id = ?";
        PreparedStatement pstmt = null;
        Boolean i = false;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1,id);
            i = pstmt.executeUpdate()==1;
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public boolean deleteUserByName(String name) {
        String sql = "delete from user where name=?";
        PreparedStatement pstmt = null;
        Boolean i = false;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,name);
            i = pstmt.executeUpdate()==1;
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     *
     * @param user
     * @return boolean
     */
    @Override
    public boolean updateUser(User user) {
        Boolean i =false;
        String sql = "update user set name=?,age=? where id=?";
        PreparedStatement pstmt = null;
        try {
            pstmt =connection.prepareStatement(sql);
            pstmt.setString(1,user.getName());
            pstmt.setInt(2,user.getAge());
            pstmt.setInt(3,user.getId());
            i = pstmt.executeUpdate()==1;
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     *
     * @param name
     * @return List<User>
     */
    @Override
    //返回resultSet，避免user重名报错
    public List<User> getUserByName(String name) {
        List<User> userList=new ArrayList<>();
        String sql = "select * from user where name like ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = new User();
        try {
            pstmt = (PreparedStatement)connection.prepareStatement(sql);
            pstmt.setString(1,name+"%");
            rs = pstmt.executeQuery();
            while(rs.next()){
                userList.add(new User(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User getUserById(int id) {
        String sql = "select * from user where id = ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = new User();
        try {
            pstmt = (PreparedStatement)connection.prepareStatement(sql);
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            user.setId(rs.getInt(1));
            user.setName(rs.getString(2));
            user.setAge(rs.getInt(3));
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getUserByAge(int age) {
        List<User> userList=new ArrayList<>();
        String sql = "select * from user where age = ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = new User();
        try {
            pstmt = (PreparedStatement)connection.prepareStatement(sql);
            pstmt.setInt(1,age);
            rs = pstmt.executeQuery();
            while(rs.next()){
                userList.add(new User(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

}
