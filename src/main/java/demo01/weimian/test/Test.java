package demo01.weimian.test;

import demo01.weimian.db.DBUtils;
import demo01.weimian.model.User;
import demo01.weimian.service.UserService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection conn= DBUtils.getConn();
        //增加数据
       //User u=new User();
        //u.setId(1);
        //u.setName("mark");
       // u.setAge(24);
      // new UserService().addUser(u);
        //User u1=new User();
        //u1.setId(2);
        //u1.setName("jhon");
        //u1.setAge(22);
        //new UserService().addUser(u1);
        //删除数据
        //new UserService().delUser(1);
        //根据id查询数据
        //User u2=new UserService().get(2);
        //System.out.println("id:"+u2.getId()+"\t"+"name:"+u2.getName()+"\t"+"age:"+u2.getAge());
      //查询所有数据
       // List<User> userList=new UserService().query();
       // for(User u:userList){
           // System.out.println("id:"+u.getId()+"\t"+"name:"+u.getName()+"\t"+"age:"+u.getAge());
       // }
        //更新数据
        User u=new User();
        u.setId(1);
        u.setName("betty");
        u.setAge(23);
        new UserService().updateUser(u);
        }
}
