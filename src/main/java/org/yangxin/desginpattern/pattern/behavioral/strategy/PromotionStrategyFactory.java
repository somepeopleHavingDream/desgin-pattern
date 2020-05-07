package org.yangxin.desginpattern.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangxin
 * 2020/03/24 21:27
 */
public class PromotionStrategyFactory {

    private static final Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.NOW_OFF, new NowOffPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASH_BACK, new CashBackPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FULL_OFF, new FullOffPromotionStrategy());
    }

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String promotionStrategyKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionStrategyKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey {

        String NOW_OFF = "nowOff";
        String CASH_BACK = "cashBack";
        String FULL_OFF = "fullOff";
    }
}
