
package demo01.zhang.model;
public class User
{
    private int id;
    private String name;
    private int age;

    public User(int id1, String name1, int age1)
    {
        id = id1;
        name = name1;
        age = age1;
    }
    User(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}