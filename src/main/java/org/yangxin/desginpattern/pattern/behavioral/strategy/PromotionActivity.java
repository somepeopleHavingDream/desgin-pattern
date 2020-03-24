package org.yangxin.desginpattern.pattern.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * 2020/03/24 21:19
 */
@NoArgsConstructor
@AllArgsConstructor
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
