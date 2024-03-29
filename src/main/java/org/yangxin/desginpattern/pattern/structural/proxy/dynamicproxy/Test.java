package org.yangxin.desginpattern.pattern.structural.proxy.dynamicproxy;

import org.yangxin.desginpattern.pattern.structural.proxy.IOrderService;
import org.yangxin.desginpattern.pattern.structural.proxy.Order;
import org.yangxin.desginpattern.pattern.structural.proxy.OrderServiceImpl;

/**
 * 动态代理测试
 *
 * @author yangxin
 * 2020/03/07 21:47
 */
@SuppressWarnings("AlibabaRemoveCommentedCode")
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService iOrderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
//        iOrderService.saveOrder(order);
        iOrderService.otherMethod();
    }
}
