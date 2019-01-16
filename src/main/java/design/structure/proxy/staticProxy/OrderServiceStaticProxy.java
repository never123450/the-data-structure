package design.structure.proxy.staticProxy;

import design.structure.proxy.IOrderSerivce;
import design.structure.proxy.Order;
import design.structure.proxy.OrderServiceImpl;
import design.structure.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {

    private IOrderSerivce iOrderSerivce;

    public int saveOrder(Order order){
        beforeMethod();
        iOrderSerivce = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRoute = userId % 2;
        System.out.println("静态代理分配到 [db" + dbRoute + "]处理数据");
        afterMethod();

        DataSourceContextHolder.serDVType(String.valueOf(dbRoute));

        return iOrderSerivce.saveOrder(order);
    }

    private void beforeMethod(){
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }


}