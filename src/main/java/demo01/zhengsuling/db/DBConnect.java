package demo01.zhengsuling.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {
    public static Connection getSqlConnect(String url,String user,String password){
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
