package org.yangxin.desginpattern.pattern.structural.facade;

/**
 * @author yangxin
 * 2020/03/10 21:25
 */
class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    void giftExchange(PointsGift pointsGift) {
        // 资格校验
        if (!qualifyService.isAvailable(pointsGift)) {
            return;
        }

        // 支付积分
        if (!pointsPaymentService.pay(pointsGift)) {
            return;
        }

        String shippingOrderNo = shippingService.shipGift(pointsGift);
        System.out.println("物流系统下单成功，订单号是：" + shippingOrderNo);
    }
}
