package org.yangxin.desginpattern.pattern.structural.proxy.staticproxy;

import org.yangxin.desginpattern.pattern.structural.proxy.IOrderService;
import org.yangxin.desginpattern.pattern.structural.proxy.Order;
import org.yangxin.desginpattern.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author yangxin
 * 2020/03/07 21:26
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService = new OrderServiceImpl();

    public int saveOrder(Order order) {
        beforeMethod();

        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】" + "处理数据");

        afterMethod();

        return iOrderService.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
