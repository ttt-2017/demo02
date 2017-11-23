package demo01.jiahua.service;

import demo01.jiahua.model.User;
import demo01.jiahua.db.Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Er on 2017/11/21.
 */
public class Service {
    private static final String TABLENAME = "user";
    private static final String NAME_COL  = "name";
    private static final String AGE_COL   = "age";
    private static final String ID_COL    = "id";
    public static void insert(User user){
        Connection connection = Utils.getConn();
        String insertSql = "insert into "+TABLENAME+" ("+NAME_COL+","+AGE_COL+","+ID_COL+") values(?,?,?)";

        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(insertSql);
            pstmt.setString(1, user.getName());
            pstmt.setInt(2, user.getAge());
            pstmt.setInt(3, user.getAge());
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void update(User user){
        Connection connection = Utils.getConn();
        String sql = "update users set "+NAME_COL+" = "
                +user.getName()+" , "+AGE_COL+" = "+user.getAge()
                +" , "+ID_COL+" = "+user.getId()+" where id= "+user.getId()+" ;";
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /***
     * 通过用户ID进行删除
     * @param user
     */
    public static void delete(User user){
        Connection conn = Utils.getConn();
        String sql = "delete from "+TABLENAME+" where "+ID_COL+" = " + user.getId()+" ;";
        Statement st;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<User> getAllData(){
        Connection conn = Utils.getConn();
        String sql = "select * from "+TABLENAME+" ;";
        PreparedStatement pstmt;
        List<User> list = new ArrayList<>();
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            User user = null;
            while (rs.next()) {
                user = new User();
                user.setName(rs.getString(1));
                user.setAge(rs.getInt(2));
                user.setId(rs.getInt(3));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
