package test;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args)  {

        String a = "1";
        String b = "2";
        System.out.println("a="+a);
        System.out.println("b="+b);

        try {
            swap(a,b);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }

//    public static void swap(String i1,String i2){
//        String temp = i1;
//        i1 = i2;
//        i2 = temp;
//    }


    public static void swap(Object i1,Object i2) throws NoSuchFieldException, IllegalAccessException {
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        Object tmp = i1.toString();
        field.set(i1,i2);
        field.set(i2,tmp);
    }

}