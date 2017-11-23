package demo01.jiahua.test;

import demo01.jiahua.model.User;
import demo01.jiahua.service.Service;

import java.util.List;

/**
 * Created by Er on 2017/11/23.
 */
public class Test {
    public static void main(String[] args){
        //构造对象
        User user1 = new User("张三",14,1);
        //插入数据
        Service.insert(user1);
        //查询数据
        List<User> list = Service.getAllData();
        for(User tmp :list){
            System.out.println(tmp);
        }
        //修改数据
        user1.setAge(15);
        Service.update(user1);
        //删除数据
        Service.delete(user1);
    }
}
