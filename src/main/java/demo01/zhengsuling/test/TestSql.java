package demo01.zhengsuling.test;


import demo01.zhengsuling.db.DBConnect;
import demo01.zhengsuling.model.User;
import demo01.zhengsuling.service.OperateSql;

import java.sql.Connection;

public class TestSql {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        String sql ="";
        Connection conn = DBConnect.getSqlConnect(url,user,password);
        //创建表
        //sql = "create table user(id int,name varchar(20),age int);";
       // OperateSql.update(conn,sql);
        //插入数据
        OperateSql.insert(conn,new User(1,"zhangsan",20));
        OperateSql.insert(conn,new User(2,"lisi",23));
        OperateSql.insert(conn,new User(3,"wangwu",20));
        //查询数据
        sql = "select id,name,age from user;";
        OperateSql.select(conn,sql);
        //更新数据
        sql = "update user set age=23 where id=1;";
        OperateSql.update(conn,sql);
        //删除数据
        sql = "delete from user where id=2;";
        OperateSql.delete(conn,sql);
        try{
            conn.close();
        }catch (Exception e){
            e.getMessage();
        }

    }
}
