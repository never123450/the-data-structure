package concurrence.longguo.condition;

import concurrence.longguo.condition2.Demo2;

public class Demo {

    private int singal;

    public synchronized void a() {
        while (singal != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a");
        singal++;
        notifyAll();
    }

    public synchronized void b() {
        while (singal != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("b");
        singal++;
        notifyAll();
    }

    public synchronized void c() {
        while (singal != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("c");
        singal = 0;
        notifyAll();
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

