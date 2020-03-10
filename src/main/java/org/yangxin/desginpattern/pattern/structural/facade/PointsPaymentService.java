package org.yangxin.desginpattern.pattern.structural.facade;

/**
 * @author yangxin
 * 2020/03/10 21:21
 */
class PointsPaymentService {

    boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分扣取成功");
        return true;
    }
}
