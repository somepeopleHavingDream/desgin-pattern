package org.yangxin.desginpattern.pattern.structural.facade;

/**
 * @author yangxin
 * 2020/03/10 21:23
 */
class ShippingService {

    String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + " 进入物流系统");
        return "666";
    }
}
