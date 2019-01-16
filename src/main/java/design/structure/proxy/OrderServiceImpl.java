package design.structure.proxy;

public class OrderServiceImpl implements IOrderSerivce{

    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("service层调用dao层添加order");
        return orderDao.insert(order);
    }
}