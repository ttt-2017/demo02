package demo01.weimian.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtils {
    private static final String URL="jdbc:mysql://localhost/test";
    private static final String USER="root";
    private static final String PASSWORD="root";
    private static Connection conn=null;
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
