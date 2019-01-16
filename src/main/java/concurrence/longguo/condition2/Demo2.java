package concurrence.longguo.condition2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo2 {

    private int singal;
    Lock lock = new ReentrantLock();
    Condition a = lock.newCondition();
    Condition b = lock.newCondition();
    Condition c = lock.newCondition();

    public void a() {
        lock.lock();
        while (singal != 0) {
            try {
                a.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a");
        singal++;
        b.signal();
        lock.unlock();
    }

    public void b() {
        lock.lock();
        while (singal != 1) {
            try {
                b.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("b");
        singal++;
        c.signal();
        lock.unlock();
    }

    public void c() {
        lock.lock();
        while (singal != 2) {
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("c");
        singal = 0;
        a.signal();
        lock.unlock();
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        A a = new A(d);
        B b = new B(d);
        C c = new C(d);

        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
    }
}

class A implements Runnable {
    private Demo2 demo;

    public A(Demo2 demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        while (true) {
            demo.a();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable {
    private Demo2 demo;

    public C(Demo2 demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        while (true) {
            demo.c();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    private Demo2 demo;

    public B(Demo2 demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        while (true) {
            demo.b();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

