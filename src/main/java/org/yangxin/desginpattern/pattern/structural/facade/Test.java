package org.yangxin.desginpattern.pattern.structural.facade;

/**
 * @author yangxin
 * 2020/03/10 21:32
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
