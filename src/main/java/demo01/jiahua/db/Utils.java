package demo01.jiahua.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Er on 2017/11/21.
 */
public class Utils {
    private static final String URL="jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=utf-8";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static Connection mysqlConn = null;

    public static Connection getConn(){
        if(mysqlConn==null){
            try{
                Class.forName(DRIVER);
                System.out.println("Connecting to database...");
                mysqlConn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("connecting to database sucessfully");
            }catch (Exception e) {
                System.out.println("can not to connecting to database");
            }
            return mysqlConn;
        }else {
            return mysqlConn;
        }
    }

}
