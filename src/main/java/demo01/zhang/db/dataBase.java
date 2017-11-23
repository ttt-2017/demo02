package demo01.zhang.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataBase {
    private static int ab(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }
    //声明Connection对象
    static Connection con;
    //驱动程序名
    private final static String driver = "com.mysql.jdbc.Driver";
    //URL指向要访问的数据库名mydata
    private final static String url = "jdbc:mysql://localhost:3306/testdb";
    //MySQL配置时的用户名
    private final static String user = "root";
    //MySQL配置时的密码
    private final static String password = "123456";
    public static Connection getConf(){
        // TODO Auto-generated method stub
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
        } catch(ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }
        return con;
    }
}
