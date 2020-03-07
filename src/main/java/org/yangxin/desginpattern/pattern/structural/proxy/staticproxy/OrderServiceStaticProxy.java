package org.yangxin.desginpattern.pattern.structural.proxy.staticproxy;

import org.yangxin.desginpattern.pattern.structural.proxy.IOrderService;
import org.yangxin.desginpattern.pattern.structural.proxy.Order;
import org.yangxin.desginpattern.pattern.structural.proxy.OrderServiceImpl;
import org.yangxin.desginpattern.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @author yangxin
 * 2020/03/07 21:26
 */
class OrderServiceStaticProxy {
    private IOrderService iOrderService = new OrderServiceImpl();

    void saveOrder(Order order) {
        beforeMethod(order);
        iOrderService.saveOrder(order);
        afterMethod();
    }

    private void beforeMethod(Order order) {
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】" + "处理数据");
        System.out.println("静态代理 before code");

        // 设置dataSource
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
