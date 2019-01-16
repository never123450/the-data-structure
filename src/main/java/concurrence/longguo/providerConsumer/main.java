package concurrence.longguo.providerConsumer;

public class main {
    public static void main(String[] args) {
        Tmall tmall = new Tmall();
        PushTarget p = new PushTarget(tmall);
        TakeTarget t = new TakeTarget(tmall);


        for (int i = 0; i < 10; i++) {
            new Thread(p).start();
        }

        for (int i = 0; i < 9; i++) {
            new Thread(t).start();
        }


    }
}