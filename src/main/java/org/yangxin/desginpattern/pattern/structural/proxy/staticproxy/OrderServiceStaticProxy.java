package org.yangxin.desginpattern.pattern.structural.proxy.staticproxy;

import org.yangxin.desginpattern.pattern.structural.proxy.IOrderService;
import org.yangxin.desginpattern.pattern.structural.proxy.Order;
import org.yangxin.desginpattern.pattern.structural.proxy.OrderServiceImpl;
import org.yangxin.desginpattern.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 订单服务静态代理
 * 代理订单服务，提供saveOrder方法，并扩展了beforeMethod、afterMethod方法
 *
 * @author yangxin
 * 2020/03/07 21:26
 */
class OrderServiceStaticProxy {

    private final IOrderService iOrderService = new OrderServiceImpl();

    /**
     * 保存订单
     *
     * @param order 订单
     */
    void saveOrder(Order order) {
        beforeMethod(order);
        iOrderService.saveOrder(order);
        afterMethod();
    }

    /**
     * 保存订单之前
     *
     * @param order 订单
     */
    private void beforeMethod(Order order) {
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】" + "处理数据");
        System.out.println("静态代理 before code");

        // 设置dataSource
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }

    /**
     * 保存订单之后
     */
    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
