package org.yangxin.desginpattern.pattern.structural.facade;

/**
 * @author yangxin
 * 2020/03/10 21:19
 */
class QualifyService {

    boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过 库存通过");
        return true;
    }
}
