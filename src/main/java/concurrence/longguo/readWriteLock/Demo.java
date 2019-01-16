package concurrence.longguo.readWriteLock;

public class Demo {
    private volatile int singal;

    public int getSingal() {
        return singal;
    }

    public void setSingal(int singal) {
        this.singal = singal;
    }


    public static void main(String[] args) {
        Demo demo = new Demo();
        new Thread(() -> {
            synchronized (demo){
                System.out.println("修改状态的线程执行...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                demo.setSingal(1);
                System.out.println("状态值修改成功。。。");
                demo.notify();
            }

        }).start();

        new Thread(() -> {
            synchronized (demo){
                //等待singal为1开始执行，否则不能执行
                while (demo.getSingal() != 1){
                    try {
//                    Thread.sleep(1000);
                        demo.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //当信号为1的时候执行代码
                    System.out.println("模拟代码的执行。。。。");
                }
            }


        });

    }
}