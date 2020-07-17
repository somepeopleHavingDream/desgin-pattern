package org.yangxin.desginpattern.pattern.structural.proxy;

/**
 * @author yangxin
 * 2020/03/07 21:23
 */
public class OrderServiceImpl implements IOrderService {

    private final IOrderDAO iOrderDAO = new OrderDAOImpl();

    @Override
    public void saveOrder(Order order) {
        // Spring会自己注入，这里就直接new了
        System.out.println("Service层调用DAO层添加Order");
        iOrderDAO.insert(order);
    }

    @Override
    public void otherMethod() {
        System.out.println("otherMethod");
    }
}
