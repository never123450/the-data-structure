package java8.shengsiyuan;

public class Person {
    private String userName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}