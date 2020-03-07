package org.yangxin.desginpattern.pattern.structural.proxy.staticproxy;

import org.yangxin.desginpattern.pattern.structural.proxy.Order;

/**
 * @author yangxin
 * 2020/03/07 21:47
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
