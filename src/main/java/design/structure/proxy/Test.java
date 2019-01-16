package design.structure.proxy;

import design.structure.proxy.staticProxy.OrderServiceStaticProxy;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

    }
}