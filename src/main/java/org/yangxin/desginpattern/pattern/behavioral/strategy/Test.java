package org.yangxin.desginpattern.pattern.behavioral.strategy;

/**
 * @author yangxin
 * 2020/03/24 21:21
 */
@SuppressWarnings("CommentedOutCode")
public class Test {

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new CashBackPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FullOffPromotionStrategy());
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

    public static void main(String[] args) {
        String promotionKey = "nowOff";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory
                .getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
