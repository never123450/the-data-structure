package concurrence.longguo.readWriteLock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DemoReadWriteLock {
    private Map<String, Object> map = new HashMap<>();

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private Lock r = readWriteLock.readLock();
    private Lock w = readWriteLock.writeLock();

    public Object get(String key) {
        r.lock();
        System.out.println(Thread.currentThread().getName() + "读操作在执行");
        try {
            Thread.sleep(1000);
            return map.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            r.unlock();
            System.out.println(Thread.currentThread().getName() + "读操作在执行完毕");
        }
        return map.get(key);
    }


    public void put(String key, Object value) {
        w.lock();
        System.out.println(Thread.currentThread().getName() + "写操作在执行");
        try {
            Thread.sleep(1000);
            map.put(key, value);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            w.unlock();
            System.out.println(Thread.currentThread().getName() + "写操作在执行完毕");
        }
    }

    public static void main(String[] args) {
        DemoReadWriteLock d = new DemoReadWriteLock();


        new Thread(new Runnable() {
            @Override
            public void run() {
                d.put("a", 10);
            }
        }).start();

        new Thread(() -> {
            d.put("a", 10);
        }).start();


        new Thread(() -> {
            d.put("b", 20);
        }).start();

        new Thread(() -> {
            d.get("b");
        }).start();
        new Thread(() -> {
            d.get("b");
        }).start();

    }

}