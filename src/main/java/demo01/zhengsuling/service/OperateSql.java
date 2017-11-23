package demo01.zhengsuling.service;
import demo01.zhengsuling.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OperateSql {

    public static void select(Connection conn,String sql){
        ResultSet rs;
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            System.out.println("============================");
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
            stmt.close();
        }
        catch(Exception e){
                    e.getMessage();}
    }
    public static void update(Connection conn,String sql){
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            int i = stmt.executeUpdate();
            if(i<0){
                System.out.print("更新失败");
            }else{
                System.out.print("更新成功");
            }
            stmt.close();
        }catch(Exception e){
            e.getMessage();
        }

    }
    public static void insert(Connection conn,User user){
        String sql = "insert into user values(?,?,?)";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setInt(3, user.getAge());
            int i = stmt.executeUpdate();
            if(i<0){
                System.out.print("插入失败");
            }else{
                System.out.print("插入成功");
            }
            stmt.close();
        }catch(Exception e) {
            e.getMessage();
        }
    }
    public static void delete(Connection conn,String sql){
        try{
            int i = conn.prepareStatement(sql).executeUpdate();
            if(i<0){
                System.out.print("删除失败");
            }else{
                System.out.print("删除成功");
            }
        }catch(Exception e){
            e.getMessage();
        }
    }
}
