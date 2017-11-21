package demo01.weimian.service;

import demo01.weimian.db.DBUtils;
import demo01.weimian.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    //添加数据
    public void addUser(User u) throws SQLException {
        Connection conn= DBUtils.getConn();
        String sql="insert into users (id,name,age) values(?,?,?)";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1,u.getId());
        ptmt.setString(2,u.getName());
        ptmt.setInt(3,u.getAge());
        ptmt.execute();
    }
    //更新数据
    public void updateUser(User u) throws SQLException {
        Connection conn=DBUtils.getConn();
        String sql="update users set id=?,name=?,age=? where id=?";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1,u.getId());
        ptmt.setString(2,u.getName());
        ptmt.setInt(3,u.getAge());
        ptmt.setInt(4,u.getId());
        ptmt.execute();
    }
    //删除
    public void delUser(Integer id) throws SQLException {
        Connection conn=DBUtils.getConn();
        String sql="delete from users where id=?";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1,id);
        ptmt.execute();
    }
    //查询所有数据
    public List<User> query() throws SQLException {
        Connection conn=DBUtils.getConn();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select id,name,age from users");
        List<User> us=new ArrayList<User>();
        User u=null;
        while (rs.next()){
            u=new User();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setAge(rs.getInt("age"));
            us.add(u);
        }
        return us;
    }
    //根据id进行查询
    public User get(Integer id) throws SQLException {
        User u=null;
        Connection conn=DBUtils.getConn();
        String sql="select * from users where id=?";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setInt(1,id);
        ResultSet rs=ptmt.executeQuery();
        while (rs.next()){
            u=new User();
            u.setId(rs.getInt("id"));
            u.setName(rs.getString("name"));
            u.setAge(rs.getInt("age"));
        }
        return u;

    }

}
