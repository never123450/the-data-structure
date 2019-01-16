package design.structure.facade;

import org.ietf.jgss.Oid;

public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvaliable(pointsGift)){
            //资格校验通过
            if (pointsPaymentService.pay(pointsGift)){
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功订单号："+ shippingOrderNo);
            }
        }
    }
}