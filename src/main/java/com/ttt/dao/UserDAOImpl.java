package com.ttt.dao;

import com.ttt.model.User;
import com.ttt.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        boolean flag=false;
        String sql = "select * from user where id=? and name=? and age=?";
        try {
            PreparedStatement pstmt=this.connection.prepareStatement(sql);
            pstmt.setInt(1, user.getId());
            pstmt.setString(2,user.getName());
            pstmt.setInt(3,user.getAge());
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return flag;

        /*String sql = "select id,name,age from User where id = " +user.getId() + " and name = \"" + user.getName() + "\" and age = " + user.getAge() + ";";
        PreparedStatement pstmt;
        Boolean i = false;
        try {
            pstmt = connection.prepareStatement(sql);
            i = pstmt.execute(sql);
            pstmt.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return i;*/
    }

    @Override
    public boolean addUser(User user) {
        String sql = "insert into user (id,name,age) values(?,?,?)";
        PreparedStatement pstmt;
        Boolean i = false;
        try {
            pstmt =connection.prepareStatement(sql);
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getName());
            pstmt.setInt(3, user.getAge());
            i = pstmt.executeUpdate()==1;
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return i;
    }

    @Override
    public boolean deleteUserById(int id) {
        String sql = "delete from user where id='" + id + "'";
        PreparedStatement pstmt;
        Boolean i = false;
        try {
            pstmt = connection.prepareStatement(sql);
            i = pstmt.executeUpdate()==1;
            System.out.println("resutl: " + i);
            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public boolean updateUser(User user) {
        Boolean i =false;
        String sql = "update user set name=?,age=? where id=?";
        PreparedStatement pstmt;
        try {
            pstmt =connection.prepareStatement(sql);
            System.out.println(sql);
            pstmt.setString(1,user.getName());
            pstmt.setInt(2,user.getAge());
            pstmt.setInt(3,user.getId());
            i = pstmt.executeUpdate()==1;
            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    //返回resultSet，避免user重名报错，注意此方法没有关闭连接connaction ，rs，pstmt
    public ResultSet getUserByName(String name) {
        String sql = "select * from user where name = ?";
        PreparedStatement pstmt;
        ResultSet rs = null;
        User user = new User();
        try {
            pstmt = (PreparedStatement)connection.prepareStatement(sql);
            pstmt.setString(1,name);
            rs = pstmt.executeQuery();
            //pstmt.close();
            //connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    //建议用此方法，返回user

    /*public User getUserByName(String name) {
        String sql = "select * from user where name = ?";
        PreparedStatement pstmt;
        ResultSet rs ;
        User user = new User();
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,name);
            rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            if(rs.next()) {
                for (int i = 1; i <= col; i++) {
                    user.setId(rs.getInt(1));
                    user.setName(rs.getString(2));
                    user.setAge(rs.getInt(3));
                }
            }
            rs.close();
            pstmt.close();
            connection.close();


        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return user;
    }
    */

}
