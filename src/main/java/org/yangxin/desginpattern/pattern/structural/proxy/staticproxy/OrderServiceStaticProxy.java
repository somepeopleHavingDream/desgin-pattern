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
        beforeMethod();

        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】" + "处理数据");

        // 设置dataSource
        DataSourceContextHolder.setDBType("db" + dbRouter);

        afterMethod();

        iOrderService.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
