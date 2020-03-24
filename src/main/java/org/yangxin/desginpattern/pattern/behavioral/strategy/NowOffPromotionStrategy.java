package org.yangxin.desginpattern.pattern.behavioral.strategy;

/**
 * @author yangxin
 * 2020/03/24 21:15
 */
public class NowOffPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}
