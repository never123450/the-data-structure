package design.singleton;

public class LazyDoubleCheckSingleton {
    //懒汉模式开始不创建对象，所以很懒
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    //私有构造器,外部不能直接new
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        //线程不安全。如果多个线程，下面这行不安全，有可能会new多次
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1、分配内存给这个对象
                    //2、初始化对象
                    //3、设置lazyDoubleCheckSingleton指向刚分配的地址
                }
            }

        }
        return lazyDoubleCheckSingleton;
    }
}