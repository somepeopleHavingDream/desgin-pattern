package org.yangxin.desginpattern.pattern.structural.proxy;

/**
 * @author yangxin
 * 2020/03/07 21:23
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDAO iOrderDAO = new OrderDAOImpl();

    @Override
    public int saveOrder(Order order) {
        // Spring会自己注入，这里就直接new了
        System.out.println("Service层调用DAO层添加Order");
        return iOrderDAO.insert(order);
    }
}
