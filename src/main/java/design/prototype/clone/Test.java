package design.prototype.clone;

import design.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Date birthday = new Date(0L);
        pig pig = new pig("佩奇",birthday);
        pig pig1 = (design.prototype.clone.pig) pig.clone();

        System.out.println(pig);
        System.out.println(pig1);

        pig.getBirthday().setTime(6666666666L);
        System.out.println(pig);
        System.out.println(pig1);


//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(cloneHungrySingleton);


    }
}