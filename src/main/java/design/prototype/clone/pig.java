package design.prototype.clone;

import java.util.Date;

public class pig implements Cloneable{
    private String name;
    private Date birthday;

    public pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        pig pig = (pig)super.clone();
        //深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }
}