package org.yangxin.desginpattern.pattern.structural.proxy;

import lombok.Data;

/**
 * 订单
 *
 * @author yangxin
 * 2020/03/07 21:17
 */
@Data
public class Order {

    private Object orderInfo;
    private Integer userId;
}
