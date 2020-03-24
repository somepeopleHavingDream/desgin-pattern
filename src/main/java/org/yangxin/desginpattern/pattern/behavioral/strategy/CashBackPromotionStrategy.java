package org.yangxin.desginpattern.pattern.behavioral.strategy;

/**
 * @author yangxin
 * 2020/03/24 21:13
 */
public class CashBackPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
