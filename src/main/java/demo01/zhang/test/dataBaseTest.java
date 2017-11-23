package demo01.zhang.test;

import demo01.zhang.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static demo01.zhang.db.dataBase.getConf;
import static demo01.zhang.service.dml.*;

public class dataBaseTest {
    public static void main(String[] args) throws SQLException {

        Connection con = getConf();
        if(con!=null){
            System.out.println("OK ");
        }else {
            System.out.println("NO");
        }

        User user = new User(1,"Tom",12);
        User user1 = new User(2,"Tomas",12);
        User user2 = new User(1,"Tom",13);

        //        testInsert(con,user2);
        testSelect(con);



        con.close();


    }
    public static void testInsert(Connection con,User user){

        int i = insert(con,user);
        System.out.println(i);
    }

    public static void testUpdate(Connection con,User user){
        int i1 = update(con,user);
        System.out.println(i1);
    }

    public static void testdelete(Connection con,String name){
        int i1 = delete(con,name);
        System.out.println(i1);
    }

    public static void testSelect(Connection con){
        ResultSet res = getAll(con);
        if(res!=null) {
            System.out.println("Select ok");
        }
    }

}
