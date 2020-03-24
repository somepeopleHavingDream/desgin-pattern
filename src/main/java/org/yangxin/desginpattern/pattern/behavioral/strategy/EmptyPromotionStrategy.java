package org.yangxin.desginpattern.pattern.behavioral.strategy;

/**
 * @author yangxin
 * 2020/03/24 21:31
 */
public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
