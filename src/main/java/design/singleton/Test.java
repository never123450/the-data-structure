package design.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws InterruptedException, Exception {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("执行完成");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//
////        HungrySingletonn newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        file.delete();
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData());
//        System.out.println(instance.getData() == newInstance.getData());


//         Class objectClass = HungrySingleton.class;
//         Constructor constructor = objectClass.getDeclaredConstructor();
//         constructor.setAccessible(true);
//         HungrySingleton newinstance = (HungrySingleton) constructor.newInstance();
//         HungrySingleton instance = HungrySingleton.getInstance();
//
//        System.out.println(instance);
//        System.out.println(newinstance);
//        System.out.println(instance == newinstance);


//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        EnumInstance instance = (EnumInstance) constructor.newInstance("xwy", 666);


    }
}