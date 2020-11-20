package org.yangxin.desginpattern.pattern.structural.proxy;

/**
 * 订单服务
 *
 * @author yangxin
 * 2020/03/07 21:19
 */
public interface IOrderService {

    /**
     * 保存订单
     *
     * @param order 订单
     */
    void saveOrder(Order order);

    /**
     * 其他方法
     */
    void otherMethod();
}
