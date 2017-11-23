package demo01.jiahua.model;

/**
 * Created by Er on 2017/11/21.
 */
public class User {
    private String name;
    private int age;
    private int id;
    public User(){}
    public User(String name,int age,int id){ this.name = name;this.age=age;this.id=id;}
    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name:"+this.name+"\tage:"+this.age+"\tid:"+this.age;
    }
}
