package org.yangxin.desginpattern.pattern.behavioral.strategy;

/**
 * @author yangxin
 * 2020/03/24 21:18
 */
public class FullOffPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200-20元");
    }
}
