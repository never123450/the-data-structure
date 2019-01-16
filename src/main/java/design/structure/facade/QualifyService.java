package design.structure.facade;

public class QualifyService {
    public boolean isAvaliable(PointsGift pointsGift){
        System.out.println("检验"+pointsGift.getName()+"积分资格通过，库存通过");
        return true;

    }
}