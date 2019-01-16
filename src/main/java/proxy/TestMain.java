package proxy;

import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String[] args) {
        Target target = new TargetImpl();
        target  = (Target) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),new TargetProxy(target));
        target.execute();
    }
}