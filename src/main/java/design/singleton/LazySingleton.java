package design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class LazySingleton{
    //懒汉模式开始不创建对象，所以很懒
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    //私有构造器,外部不能直接new
    private LazySingleton(){
        if (flag){
            flag = false;
        }else  if(lazySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public synchronized static LazySingleton getInstance(){
        //线程不安全。如果多个线程，下面这行不安全，有可能会new多次
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws Exception {
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

        //不加上下面代码前是正常的，使用反射破坏单例
        //=========================
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(01,true);
        //=========================

        LazySingleton o2 = (LazySingleton) c.newInstance();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
    }
}