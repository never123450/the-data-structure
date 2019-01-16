package design.singleton;

public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadInstanceThreadLocal
            = new ThreadLocal<ThreadLocalInstance>(){

        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };


    public ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance(){
        return threadInstanceThreadLocal.get();
    }
}